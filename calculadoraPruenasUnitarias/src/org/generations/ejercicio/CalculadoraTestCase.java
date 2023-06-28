package org.generations.ejercicio;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class CalculadoraTestCase {

	@Test
	void testSumar() {
		int resultado = Calculadora.suma(5, 3);
		assertEquals(8, resultado);; //Deprecated =(
	}
	
	@Test
	void testMultiplicar() {
		int resultado = Calculadora.multiplicar(2, 3);
		assertEquals(6, resultado);; //Deprecated =(
	}
	
	@Test
	void testDividir() {
		Double resultado = Calculadora.dividir(6d, 2d);
		assertEquals(3.0, resultado);; //Deprecated =(
	}
	
	@Test(expected = ArithmeticException.class)
	void testDividir2() {
		Double resultado = Calculadora.dividir(6d, 0d);
		assertEquals(6.0, resultado);; //Deprecated =(
	}


}
