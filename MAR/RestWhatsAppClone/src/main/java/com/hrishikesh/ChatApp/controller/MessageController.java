package com.hrishikesh.ChatApp.controller;

import com.hrishikesh.ChatApp.exceptionHandler.MessageNotFoundException;
import com.hrishikesh.ChatApp.exceptionHandler.UserNotFoundException;
import com.hrishikesh.ChatApp.model.Message;
import com.hrishikesh.ChatApp.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("api/v1/message")
public class MessageController {
    @Autowired
    private MessageService messageService;
    @PostMapping("saveMessage")//✅
    private ResponseEntity<Message> saveMessage(@Valid @RequestBody Message message) throws UserNotFoundException {
        return new ResponseEntity<>(messageService.saveMessage(message), HttpStatus.CREATED);
    }
    @GetMapping("getMessage")//✅
    private List<Message> getMessage(@RequestParam Integer senderId,
                                     @RequestParam Integer receiverId) throws MessageNotFoundException {
        return messageService.getMessage(senderId, receiverId);
    }
    @DeleteMapping("deleteMessage")//✅
    private ResponseEntity<String> deleteMessage (@RequestParam Integer messageId) throws MessageNotFoundException {
        String respose = messageService.deleteMessage(messageId);
        return new ResponseEntity<>(respose, HttpStatus.ACCEPTED);
    }

}
