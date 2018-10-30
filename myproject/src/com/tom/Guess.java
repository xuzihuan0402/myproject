package com.tom;

import java.util.Random;
import java.util.Scanner;

public class Guess {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int result = random.nextInt(100)+1;
		System.out.println(result);
		int min = 1;
		int max = 100;
		System.out.println(min+"to"+max+",please enter number:");
		int guess = sc.nextInt();
		while(result!=guess) {
			if(guess>result&&guess<=100) {
				max = guess;	 
			}else {
				min = guess;
			}
			System.out.println(min+"to"+max+",please enter number:");
			guess = sc.nextInt(); //ÔÙ²Â
		}
		 
		System.out.println("ºÃ°ô°ô£¡");
		}

}
	

