package com.example.nauticos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeiroController {
	
		
		@GetMapping ("/teste")
		
		public String colaborador () {
			
			
			return "Luis";
		}

}