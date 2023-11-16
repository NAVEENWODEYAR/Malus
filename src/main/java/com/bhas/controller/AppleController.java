package com.bhas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bhas.service.AppleService;

@RestController("/apple")
public class AppleController 
{
	// DI,
	@Autowired
	private AppleService appleService;
	
	// API's,
	// 1. test EndPoint
	@GetMapping("/msg")
	public String greet()
	{
		return "Welcome to Malus_App,";
	}
	
}
