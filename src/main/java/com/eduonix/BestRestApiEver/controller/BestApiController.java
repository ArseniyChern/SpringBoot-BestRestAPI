package com.eduonix.BestRestApiEver.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BestApiController {
	
	@RequestMapping("/")
	public String bestApi() {
		return "This is the best api you've ever seen";
	}
	
	

}
