package com.jarvis.callexternalapi.controller;

import com.jarvis.callexternalapi.services.UsingRestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestTemplateController {

    @Autowired
    UsingRestTemplate restTempService;

    @GetMapping("/getApi")
    public void callPostService(){
        restTempService.callExternalServiceUsingRestTemplate();
    }
}
