package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
		
		@GetMapping("/dummyData")
		public String getDummyData() {
			return "I updated my controller again this evening";
		}
		
		
	}


