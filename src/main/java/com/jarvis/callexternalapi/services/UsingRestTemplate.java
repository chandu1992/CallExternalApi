package com.jarvis.callexternalapi.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UsingRestTemplate {

    @Value("${external.service.posturl}")
    String posturl;

    public void callExternalServiceUsingRestTemplate(){

        RestTemplate restTemplate = new RestTemplate();
        // null because service does not have any payload or headers
        // String.class is Response type
        ResponseEntity<String> response = restTemplate.exchange(posturl, HttpMethod.GET,null, String.class);
        System.out.println(response.getBody());

    }
}
