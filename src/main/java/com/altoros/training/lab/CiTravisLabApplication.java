package com.altoros.training.lab;

import com.altoros.training.lab.controllers.HelloWorldController;import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class CiTravisLabApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloWorldController.CiTravisLabApplication.class, args);
    }



}
