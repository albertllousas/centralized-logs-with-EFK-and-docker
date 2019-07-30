package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MicroServiceController {

    private static final Logger LOG = LoggerFactory.getLogger(MicroServiceController.class);

    @RequestMapping("/hello-world")
    public String greeting() {
        LOG.info("Hello world!");
        return "Hello world!";
    }
}