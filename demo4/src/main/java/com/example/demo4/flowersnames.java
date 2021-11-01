package com.example.demo4;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class flowersnames {
	
	@GetMapping("/flowers")
	public String flowers() {
		return "ALL FLOWERS ARE WELL" ;
	}
		
		
		
}
