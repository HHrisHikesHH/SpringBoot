package com.hrishikesh.ChatApp.service;

import com.hrishikesh.ChatApp.dao.DummyUserDao;
import com.hrishikesh.ChatApp.dao.UserDao;
import com.hrishikesh.ChatApp.exceptionHandler.UserNotFoundException;
import com.hrishikesh.ChatApp.model.DummyUser;
import com.hrishikesh.ChatApp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class UserService {
    private static Integer loggedInUser = 0;
    @Autowired
    UserDao userDao;
    @Autowired
    DummyUserDao dummyUserDao;
    public User saveUser(User user) {
        return userDao.save(user);
    }
    public List<User> getUser(String adminPassword) throws UserNotFoundException {
        List<User> userList = new ArrayList<>();
        if(userId == null){
            userList = userDao.findAll();
        }else{
            if(!userDao.existsById(loggedInUser))
                throw new UserNotFoundException("User doest not exist");
            else userList.add(userDao.findById(loggedInUser).get());
        }
        return userList;
    }
    public String deleteUser(Integer userId) throws UserNotFoundException {
        if(!userDao.existsById(userId))
            throw new UserNotFoundException("User doest not exist");
        else {
            String response = userDao.findById(userId).get().getUserName();
            userDao.deleteById(userId);
            return response;
        }
    }

    public Map<String, List<Integer>> addContact(Integer userId, String contactIds) throws UserNotFoundException {
        if(!userDao.existsById(userId))
            throw new UserNotFoundException("User doest not exist");
        else {
            String[] contactList = contactIds.split(",");
            User user = userDao.findById(userId).get();
            Map<String, List<Integer>> response = new HashMap<>();
            List<Integer> userNotFoundList = new ArrayList<>();
            Set<DummyUser> newContactList = new HashSet<>();
            for(String contactId: contactList){
                Integer contactIdInt = Integer.parseInt(contactId);
                if(userDao.existsById(contactIdInt)){
                    User userTobeAdded = userDao.findById(userId).get();
                    newContactList = userTobeAdded.getMyContacts();
                    DummyUser dummyUser =
                            new DummyUser(contactIdInt, userDao.findById(contactIdInt).get().getUserName());
                    newContactList.add(dummyUserDao.save(dummyUser));
                }
                else{
                    userNotFoundList.add(contactIdInt);
                }
            }
            user.setMyContacts(newContactList);
            userDao.save(user);
            response.put("userNotFoundList", userNotFoundList);
            return response;
        }
    }
//    private JSONObject cloneUser(User user) {
//        JSONObject userClone = new JSONObject();
//        userClone.put("userId",user.getUserId().toString());
//        userClone.put("userName",user.getUserName());
//        userClone.put("email", user.getEmail());
//        userClone.put("phoneNumber",user.getPhoneNumber());
//        return userClone;
//    }

    public User updateUser(Integer userId, User newUser) throws UserNotFoundException {
        if(!userDao.existsById(userId))
            throw new UserNotFoundException("User doest not exist");
        else {
            User oldUser = userDao.findById(userId).get();
            return this.update(newUser, oldUser);
        }
    }

    private User update(User newUser, User oldUser) {
        if(newUser.getUserName() != null) oldUser.setUserName(newUser.getUserName());
        if(newUser.getMyContacts() != null) oldUser.setMyContacts(newUser.getMyContacts());
        if(newUser.getEmail()!= null) oldUser.setEmail(newUser.getEmail());
        if(newUser.getGender() != null) oldUser.setGender(newUser.getGender());
        if(newUser.getPhoneNumber() != null) oldUser.setPhoneNumber(newUser.getPhoneNumber());
        return userDao.save(oldUser);
    }

    public String logIn(Integer userId) throws UserNotFoundException {
        String response = "";
        if(!userDao.existsById(userId))
            throw new UserNotFoundException("User not found");
        else{
            if(loggedInUser == null){
                loggedInUser = userId;
                response = "user logged in success";
            }
            else if(loggedInUser.equals(userId)) response = "user already logged in";
            else response = "user with userId " + loggedInUser + " is loggedIn, log out first";
        }
        return response;
    }
}
