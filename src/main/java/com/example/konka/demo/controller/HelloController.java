package com.example.konka.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hipi
 */
@RestController
@RequestMapping("v1/hello")
@Slf4j
public class HelloController {


    @GetMapping("")
    public String hello(){
        log.info("hello ---> spring boot");

        return "hello devops asdf spring  boot!!!!";
    }
}
