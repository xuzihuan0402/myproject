package com.tom;

import java.util.Scanner;

public abstract class Temperature {

	public static void main(String[] args) {
		System.out.println("Please enter a degree Celsius number.");
		Scanner scanner = new Scanner(System.in);
		double c = scanner.nextDouble();
		Temp temp = new Temp(c);
		
//		double f = c*(9/5.0)+32;
		System.out.printf("%.1f C = %.1f F\nKelvin : %.1f K",c,temp.fahrenheit(),temp.kelvin());

	}

}
