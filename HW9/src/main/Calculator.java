package main;

public class Calculator {// bei allen Methoden fehlen Möglichkeiten ein Überschreiten des Wertebereiches zu verhindern

	public static int add(int valueOne, int valueTwo) {
		return valueOne + valueTwo;
	}
	
	public static int sub(int valueOne, int valueTwo) {
		return valueOne - valueTwo;
	}
	
	public static int multiply(int valueOne, int valueTwo) {
		return valueOne * valueTwo;
	}
	
	public static float divide(int numerator, int denominator){
		if (denominator == 0) 
			throw new ArrayIndexOutOfBoundsException("ZeroDivisionError");

		return (float) numerator / denominator;
	}
}
