package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AddSubAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AddSubAppApplication.class, args);
	}

	@GetMapping("/add")
	public String add(@RequestParam(value = "name", defaultValue = "World") String name,
					  @RequestParam(value = "first", defaultValue = "error") String first,
					  @RequestParam(value = "second", defaultValue = "error") String second) {

		if(first.equals("error") || second.equals("error")) {
			return "Enter values";
		}
		double a = Integer.parseInt(first);
		double b = Integer.parseInt(second);
		double result = a + b;
		return String.valueOf(result);
	}

	@GetMapping("/sub")
	public String sub(@RequestParam(value = "name", defaultValue = "World") String name,
					  @RequestParam(value = "first", defaultValue = "error") String first,
					  @RequestParam(value = "second", defaultValue = "error") String second) {
		if(first.equals("error") || second.equals("error")) {
			return "Enter values";
		}
		double a = Integer.parseInt(first);
		double b = Integer.parseInt(second);
		double result = a - b;
		return String.valueOf(result);
	}
}
