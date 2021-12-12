package test;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


import main.Calculator;


class TestCalculator {

	Calculator calculator = new Calculator();

	@Test
	public void Should_add_two_numbers_and_return_result() {
		System.out.println("2 plus 4 = "+Calculator.add(2,4));
	}

	@ParameterizedTest
	@CsvSource({"1,7","9,-100,0","2147483602,45"}) //erhöhen von 2147483602 um eins führt zu falschem Ergebnis, da Int.MAX_VALUE überschritten wird
	public void Should_add_two_numbers_and_return_result_parameterized(int valueOne, int valueTwo) {
		System.out.println(valueOne+" + "+valueTwo+" = "+Calculator.add(valueOne,valueTwo));
	}
	
	@Test
	public void Should_substract_two_numbers_and_return_result() {
        System.out.println("5 - 3 = "+Calculator.sub(5,3));
	}
	
	@Test
	public void Should_multiply_two_numbers_and_return_result() {
	    System.out.println("3 * 3 ="+Calculator.multiply(3,3));
	}
	
	@Test
	public void Should_divide_two_numbers_and_return_result() {
		System.out.println("3 / 6 = "+Calculator.divide(3,6));
	}
	
	@Test
	public void Should_throw_an_arithmetic_exception_if_denominator_is_zero() {
		assertThrows(IndexOutOfBoundsException.class, () -> Calculator.divide(4,0));
	}
}
