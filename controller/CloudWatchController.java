package com.cloudwatchloggerexample.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CloudWatchController {

    private static final Logger logger = LogManager.getLogger(CloudWatchController.class);

    @GetMapping("/hello")
    public String sayHello() {
        String message = "I am Shraddha Patil!";
        logger.info(message);
        return message;
    }
}
