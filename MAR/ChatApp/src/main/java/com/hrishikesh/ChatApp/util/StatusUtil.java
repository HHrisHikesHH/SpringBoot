package com.hrishikesh.ChatApp.util;

import com.hrishikesh.ChatApp.model.Status;
import org.json.JSONObject;
import org.springframework.stereotype.Component;

@Component
public class StatusUtil {
    public Status stringToJsonToStatus(String statusData) {
        JSONObject jsonObject = new JSONObject(statusData);
        Status status = new Status();

        status.setStatusName(jsonObject.getString("statusName"));
        status.setStatusDescription(jsonObject.getString("statusDescription"));

        return  status;
    }
}
