package com.hrishikesh.ChatApp.service;

import com.hrishikesh.ChatApp.dao.ChatDao;
import com.hrishikesh.ChatApp.dao.MessageDao;
import com.hrishikesh.ChatApp.model.Chat;
import com.hrishikesh.ChatApp.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ChatService {
    @Autowired
    private MessageDao messageDao;
    @Autowired
    private ChatDao chatDao;

    public Chat saveChat(Chat chat) {
        return chatDao.save(chat);
    }

    public Message saveInChat(Message message) {
        Integer senderId = message.getSenderId();
        Integer receiverId = message.getReceiverId();
        List<Chat> chatList = chatDao.findAll();
        Chat chat = this.findChat(chatList, senderId, receiverId);
        if(chat != null){
            if(chat.getSent().get(0).getSenderId().equals(senderId))
                chat.getSent().add(message);
            else chat.getReceived().add(message);
            chatDao.save(chat);
        }
        else {
            Chat newChat = new Chat();
            List<Message> msgList = new ArrayList<>();
            msgList.add(message);
            newChat.setSent(msgList);
            chatDao.save(newChat);
        }
        return message;
    }
    private Chat findChat(List<Chat> chatList, Integer senderId, Integer receiverId) {
        for(Chat chat : chatList){
            List<Message> sentMessageList = chat.getSent();
            if(this.findUserId(sentMessageList, senderId, receiverId)) return chat;
        }
        return null;
    }
    private boolean findUserId(List<Message> MessageList, Integer senderId, Integer receiverId) {
        for(Message message: MessageList){
            if(message.getSenderId().equals(senderId) && message.getReceiverId().equals(receiverId))
                return true;
        }
        return false;
    }
}
