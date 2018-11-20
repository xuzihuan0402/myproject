package com.tom;

import java.util.Random;
import java.util.Scanner;

public class Guess3 {

	public static void main(String[] args) {
		int count = 1;
		Random random = new Random();
		int secret = random.nextInt(10)+1;
		System.out.println(secret);
		Scanner scanner = new Scanner(System.in);
		int guess = 0;
		for(int i = 1; i<=4 ; i=i+1 ) {
			System.out.print("Your guess(" +i+ "/4) : ");
			guess = scanner.nextInt();
			if(guess > secret) {
				System.out.println("lower");
			}else if(guess > secret){
				System.out.println("higher");
			}else {
				break;
			}
		}
		if(guess==secret) {
			System.out.println("Great");
		}else {
			System.out.println("Poor");
		}
	}
}
		
		
		/*
		while(guess !=secret && count<=4){
			System.out.println("Your guess("+count+"/4): ");
			guess = scanner.nextInt();
			if(guess < secret){
				System.out.println("hight");
			}else{
				if(guess > secret){
					System.out.println("lower");
				}else{
					break;
				}
			}
			count++;
		}
		
		if(count>2 && guess == secret){
			System.out.println("Great! The secret number is "+secret);
		}else{
			if(guess==secret){
				System.out.println("Excellent! The secret number is "+secret);
			}else{
				System.out.println("hehe");
			}
		}
		
		
	}
	*/


