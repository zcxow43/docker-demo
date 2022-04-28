package com.example.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApiController {
    @RequestMapping(value = "/test", method = {RequestMethod.GET}, produces = { "application/json" })
    public String hello() {
        return "Hello World!";
    }
}