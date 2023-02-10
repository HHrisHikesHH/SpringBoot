package com.hrishikesh.ApiHitCounter.controller;

import com.hrishikesh.ApiHitCounter.model.HitCounter;
import com.hrishikesh.ApiHitCounter.service.UrlHitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/visitors-count")
class UrlHitController {

    @Autowired
    private UrlHitService urlService;

    public UrlHitController(UrlHitService urlService) {
        this.urlService=urlService;
    }

    @GetMapping("/username/{username}/count")
    public String getCount(@PathVariable String username) {
        String visit=urlService.getVisits(username);
//        System.out.println(visit.getCount() + " " + visit.getName());
        return visit.toString();
    }
}
