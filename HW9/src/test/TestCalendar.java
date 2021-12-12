package test;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import main.Calendar;

import static org.junit.Assert.*;

import java.util.GregorianCalendar;

class TestCalendar {
	

	@ParameterizedTest
	@ValueSource(ints= {2016,2020,2024,2027,2032,2100})//2100 und 2027  sollen false sein
	public void Should_return_true(int year) {
		main.Calendar Jahre=new main.Calendar(year);
		assertTrue(Jahre.isLeapYear());
	}

	@ParameterizedTest
	@ValueSource(ints= {2100,2200,2021,2022,2023,2016,2000})// 2016 und 2000 sollen True sein
	public void Should_return_false(int year) {
		main.Calendar Jahre=new main.Calendar(year);
		assertFalse(Jahre.isLeapYear());
	}

	@ParameterizedTest
	@ValueSource(ints= {2021,2100,2016})//2021 und 2100 sollen falsch sein
	public void Should_return_if_year_is_leap(int year) {
		GregorianCalendar Jahr= new GregorianCalendar(year,12,11);
		assertTrue(Jahr.isLeapYear(year));
	}

	@ParameterizedTest
	@ValueSource(ints= {-100,-10,Integer.MIN_VALUE,1})
	public void Should_return_false_if_negative(int year){
		main.Calendar Jahr=new main.Calendar(year);
		assertFalse(Jahr.isLeapYear());
		
	}
}
