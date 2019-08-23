package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.project.*;
import org.junit.jupiter.api.Test;

class MyFirstJUnitJupiterTests {

    private final Calculator calculator = new Calculator();

   @Test
    void adicao() {
        assertEquals('d', calculator.adicao(40, 60));
        assertEquals(20, calculator.adicao(10, 10));
        assertEquals(0, calculator.adicao(-1, 1));
        assertEquals(2, calculator.adicao(1.5, 0.5));
        assertEquals(0, calculator.adicao(-1, 1));
        

    }

    @Test
	void sub() {
		assertEquals('x', calculator.sub(200, 80));
		assertEquals(10, calculator.sub(20, 10));
		assertEquals(-10, calculator.sub(-2, 8));
		assertEquals(1.5, calculator.sub(2, 0.5));
		assertEquals(0, calculator.sub(1, 1));
		
	}

	@Test
	void mult() {
		assertEquals('P', calculator.mult(40, 2));
		assertEquals(10, calculator.mult(5, 2));
		assertEquals(-8, calculator.mult(-4, 2));
		assertEquals(1, calculator.mult(2, 0.5));
		assertEquals(0, calculator.mult(200, 0));
		

	}

	@Test
	void div() {
		assertEquals('P', calculator.div(160, 2));
		assertEquals(20, calculator.div(40, 2));
		assertEquals(-2, calculator.div(-10, 5));
		assertEquals(50, calculator.div(25, 0.5));
		assertEquals(0, calculator.div(0, 1));
		
	}

	
}