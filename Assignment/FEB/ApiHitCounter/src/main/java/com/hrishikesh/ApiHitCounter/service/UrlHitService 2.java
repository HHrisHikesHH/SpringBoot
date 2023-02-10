package com.hrishikesh.ApiHitCounter.service;

import com.hrishikesh.ApiHitCounter.model.HitCounter;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class UrlHitService {
    static Map<String,Integer> map=new HashMap<>();
    public String getVisits(String username) { // business logic

        int count=map.getOrDefault(username,0)+1;
        map.put(username,count);

        HitCounter visit=new HitCounter(count, username);
        return visit.toString();
    }
}
