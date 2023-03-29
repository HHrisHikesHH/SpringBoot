package com.hrishikesh.ChatApp.service;

import com.hrishikesh.ChatApp.dao.MessageDao;
import com.hrishikesh.ChatApp.exceptionHandler.MessageNotFoundException;
import com.hrishikesh.ChatApp.exceptionHandler.UserNotFoundException;
import com.hrishikesh.ChatApp.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {
    @Autowired
    private MessageDao messageDao;
    @Autowired
    private ChatService chatService;

    public Message saveMessage(Message message) throws UserNotFoundException {
        if(messageDao.findById(message.getSenderId()).isPresent() &&
                messageDao.findById(message.getReceiverId()).isPresent())
        return chatService.saveInChat(messageDao.save(message));
        else throw new UserNotFoundException("Add user before sending the message");
    }

    public List<Message> getMessage(Integer senderId, Integer receiverId) throws MessageNotFoundException {
        List<Message> messageList = messageDao.getChatOf(senderId, receiverId);
        if(messageList.isEmpty())
            throw new MessageNotFoundException("Requested Chats doesn't exist");
        return messageList;
    }

    public String deleteMessage(Integer messageId) throws MessageNotFoundException {
        if(!messageDao.existsById(messageId))
            throw new MessageNotFoundException("Requested Message doesn't exist");
        else {
            Message message = messageDao.findById(messageId).get();
            if(message.getMessageBody().equals("Message deleted"))
                throw new MessageNotFoundException("Requested Message already deleted");
            message.setMessageBody("Message deleted");
            messageDao.save(message);
        }
        return "Message Deleted";
    }
}
