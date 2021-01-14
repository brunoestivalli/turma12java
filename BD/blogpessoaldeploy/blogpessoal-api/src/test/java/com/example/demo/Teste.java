package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
public class Teste {

	@Test 	
	public void Addtest() {
	Calculadora junit= new Calculadora();

	int result= junit.soma(100, 200);

	assertEquals(500, result);
	}
}
