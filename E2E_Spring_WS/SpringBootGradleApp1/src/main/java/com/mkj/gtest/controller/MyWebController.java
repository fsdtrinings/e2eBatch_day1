package com.mkj.gtest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mybatch")
public class MyWebController {

	@GetMapping("/welcome")
	public String abc()
	{
		return "Welcome Ramesh";
	}
	
}
