package com.example.spring;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController


public class localizacao {

	@GetMapping("obtemlocal")
	
	public String obtemlocalização() {
		return "MARIAAAAAA";
		
	}
}