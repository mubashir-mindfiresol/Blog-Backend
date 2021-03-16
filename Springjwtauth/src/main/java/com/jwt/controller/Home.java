package com.jwt.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {
	@RequestMapping("/welcome")
	public String Welcome() {
		String text="this is a private mesaage";
		text +="this page is not allowed to unauthenticated user";
		return text;
	}
	@RequestMapping("/getusers")
	public String getusers() {
		return "{\"name\":\"varsha\"}";
		
	}

}
