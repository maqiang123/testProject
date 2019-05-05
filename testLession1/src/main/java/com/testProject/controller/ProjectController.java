package com.testProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("/test")
public class ProjectController {

	@RequestMapping("/hello")
	public String hello() {
		
		return "hello  everyone!";
		
	}
}
