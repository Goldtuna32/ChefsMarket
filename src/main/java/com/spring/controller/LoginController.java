package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	
	@RequestMapping("/")
	public String showIndex() {
		return "index";
	}
	
	@RequestMapping("/register")
	public String showRegister() {
		return "register";
	}

}
