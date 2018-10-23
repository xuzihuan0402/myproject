package com.tom;

import java.util.Scanner;

public class RangeTester {

	public static void main(String[] args) {
		System.out.println("Please enter an integer.");
		Scanner scanner = new Scanner(System.in);
		int line =  scanner.nextInt();
		System.out.println(-3<=line && line<=5);
	}

}
