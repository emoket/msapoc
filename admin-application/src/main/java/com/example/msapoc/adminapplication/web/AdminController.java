package com.example.msapoc.adminapplication.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class AdminController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ResponseEntity welcome(){
        return new ResponseEntity("Welcome to ADMIN SERVER. only ADMIN can access here.", HttpStatus.OK);
    }

    @RequestMapping(value = "/get-time", method = RequestMethod.GET)
    public ResponseEntity getTime(){
        return new ResponseEntity(LocalDateTime.now(), HttpStatus.OK);
    }
}
