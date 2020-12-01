package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/metodos")
public class Controller {
	
	@GetMapping
	public String metodos() {
		
		return "Persistencia, Atenção as detalhes";
	}
	
}
