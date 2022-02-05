package com.demo.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SampleApplication {

	@GetMapping("/")
	public String home()
	{
		return "Hello! Welcome to BB 123";
	}
	public static void main(String[] args) {
		SpringApplication.run(SampleApplication.class, args);
	}

}
