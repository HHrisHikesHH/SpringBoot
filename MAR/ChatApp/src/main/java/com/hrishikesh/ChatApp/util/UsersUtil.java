package com.hrishikesh.ChatApp.util;

import com.hrishikesh.ChatApp.model.Status;
import com.hrishikesh.ChatApp.model.Users;
import org.json.JSONObject;
import org.springframework.stereotype.Component;

@Component
public class UsersUtil {

    public Users stringToJsonToUsers(String userData) {
        JSONObject jsonObject = new JSONObject(userData);
        Users users = new Users();

        users.setUsername(jsonObject.getString("username"));
        users.setPassword(jsonObject.getString("password"));
        users.setEmail(jsonObject.getString("email"));
        users.setPhoneNumber(jsonObject.getString("phoneNumber"));
        users.setGender(jsonObject.getString("gender"));
        users.setFirstName(jsonObject.getString("firstName"));
        users.setLastName(jsonObject.getString("lastName"));
        users.setAge(jsonObject.getInt("age"));

        return  users;
    }

    public JSONObject validateUser(String userData) {
        JSONObject errorList = new JSONObject(userData);

        if(errorList.has("username")){
            String username = errorList.getString("username");
        }else{
            errorList.put("username" , "Mandatory params missing");
        }
        if(errorList.has("password")){
            String password = errorList.getString("password");
        }else{
            errorList.put("password" , "Mandatory params missing");
        }
        if(errorList.has("email")){
            String email = errorList.getString("email");
        }else{
            errorList.put("email" , "Mandatory params missing");
        }
        if(errorList.has("firstName")){
            String firstName = errorList.getString("firstName");
        }else{
            errorList.put("firstName" , "Mandatory params missing");
        }





    }
}
