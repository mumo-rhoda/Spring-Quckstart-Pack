package com.example.SpringWeb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
// a simple "Hello World" web service in Spring Boot
@SpringBootApplication //
@RestController //tells Spring that this code describes an endpoint that should be made available over the web
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/hello") //use hello to answer requests that get sent to the url address
	public String hello(@RequestParam(value = "Rhoda", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);// epect a name value defaultValue is World
	}//method designed to take String parameter called name and combines it with word hello in the code

}
