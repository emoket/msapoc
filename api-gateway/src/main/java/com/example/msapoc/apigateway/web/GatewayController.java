package com.example.msapoc.apigateway.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GatewayController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ResponseEntity welcome(){
        return new ResponseEntity("Welcome to Zuul API Gateway SERVER. Everyone can access here.", HttpStatus.OK);
    }

    @RequestMapping(value = "/users", method = RequestMethod.POST)
    public ResponseEntity adminCreate(){
        // TODO : 새로운 ADMIN을 등록하는 내용을 추가한다
        return new ResponseEntity("등록 성공.", HttpStatus.OK);
    }
}
