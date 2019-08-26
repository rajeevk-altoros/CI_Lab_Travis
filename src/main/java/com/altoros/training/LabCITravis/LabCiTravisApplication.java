package com.altoros.training.LabCITravis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class LabCiTravisApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabCiTravisApplication.class, args);
	}

	@GetMapping("/hi")
	public String sendMessage(){
		return "Hello World";
	}
}
