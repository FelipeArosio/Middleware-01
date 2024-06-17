package com.develhope.Middleware_01.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class BasicController {

    @GetMapping("/time")
    public LocalDateTime getCurrentTime() {
        return LocalDateTime.now();
    }
}

