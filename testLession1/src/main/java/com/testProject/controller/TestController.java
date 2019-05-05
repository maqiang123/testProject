package com.testProject.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/project")
public class TestController {

	@RequestMapping(value="/test")
	public String test() {
		return "如今的现在早已不是曾经说好的以后！";
	}
}
