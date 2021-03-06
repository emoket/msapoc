package com.example.msapoc.resourceapplication.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.LinkedHashMap;
import java.util.Map;

@RestController
@Slf4j
public class ResourceController {

    @RequestMapping(value = "/")
    public ResponseEntity welcome() {
        return new ResponseEntity("Welcome to RESOURCE SERVER. Everyone can access here.", HttpStatus.OK);
    }

    @RequestMapping(value = "/user-only", method = RequestMethod.GET)
    public ResponseEntity getUser(Principal user) {
        Map<String, Object> map = new LinkedHashMap<String, Object>();
        map.put("name", user.getName());
        map.put("roles", AuthorityUtils.authorityListToSet(((Authentication)user).getAuthorities()));
        return new ResponseEntity(map, HttpStatus.OK);
    }

    @RequestMapping(value = "/user-post", method = RequestMethod.POST)
    public ResponseEntity postMethodTest() {
        return new ResponseEntity("RESOURCE SERVER. POST METHOD.", HttpStatus.OK);
    }

}
