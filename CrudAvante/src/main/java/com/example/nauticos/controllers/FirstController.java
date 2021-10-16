package com.example.nauticos.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  // 
public class FirstController {
	
		
		@RequestMapping
 		public String ola () {
			
			
			return "Ola Spring Boot";
		}

}
