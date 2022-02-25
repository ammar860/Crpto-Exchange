package com.example.springbootdocker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class CryptoController {
    @Autowired
    RestTemplate restTemplate;
    @Value("${app.config.api.key}")
    String key;

    @RequestMapping(method = RequestMethod.GET,value = "/stats")
    public ResponseEntity<?> message(){
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(List.of(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<>(headers);
        ResponseEntity<Object> responseEntity = restTemplate.exchange( "https://api.nomics.com/v1/exchange-rates?key="+key, HttpMethod.GET, entity, Object.class);
        return new ResponseEntity<>(responseEntity, HttpStatus.OK);
    }
}
