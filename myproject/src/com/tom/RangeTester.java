package com.tom;

import java.util.Scanner;

public class RangeTester {

	public static void main(String[] args) {
		System.out.println("Please enter an integer.");
		Scanner scanner = new Scanner(System.in);
		String line =  scanner.nextLine();
		boolean integer = line.equals("-3")||line.equals("-2")||line.equals("-1")||line.equals("0")||line.equals("1")||line.equals("2")||line.equals("3")||line.equals("4")||line.equals("5");
		System.out.println(integer);

	}

}
