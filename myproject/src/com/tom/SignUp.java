package com.tom;

import java.util.Scanner;

public class SignUp {

	public static void main(String[] args) {
		System.out.println("Are you 18 ? (Y/N)");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		boolean adult = line.equalsIgnoreCase("y");
		System.out.println(adult);
		if(adult){
			System.out.print("Your age?");
			int age = scanner.nextInt();
			scanner.nextLine();
			System.out.print("Your name?");
			String name = scanner.nextLine();
			System.out.print("Your nick name?");
			String nickName = scanner.nextLine();
			System.out.println(age + "/" + name + "/" + nickName );
		
			
		}else{
			System.out.println("Thank you! Bye!");
		}
		
	}
}
	