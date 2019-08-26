package com.altoros.training.lab.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

   private OverKillService overKillService = new OverKillService();


    @GetMapping("/hi")
    public String sendMessage() {
        return "Hello World";
    }

    @GetMapping("/hi/{name}")
    public String sendCustomeMessage(@PathVariable String name) {
        return overKillService.concatenate2(name);
    }
}
