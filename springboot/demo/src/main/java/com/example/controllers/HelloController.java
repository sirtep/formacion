package com.example.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController{
	@GetMapping("/")
	public String ind() {
		return "test";
	}
	
	@RequestMapping("/hola")
	public String hola() {
		return "hi";
	}
	
}


