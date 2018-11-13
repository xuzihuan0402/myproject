package com.tom;

import java.util.Random;
import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		int i =0;
		for(i=0;i<3;i++){
			System.out.println(i);
		}
		System.out.println(i);
		
		
//		int a =1 ;
//		while(a>0){
//			System.out.println("hahahaha");
//			a = a-1;
//		}
		
		
//		Random random = new Random();
//		int secret = random.nextInt(100)+1;
//		System.out.println(secret);
//		
//		
//		
//		int m = 5 %  3;
//		System.out.println(m);
//		
//		float n = 15.66189f;
//		System.out.printf("Your age : %.2f" , n);
	
		
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Your name:");
//		String name = scanner.nextLine();
//		System .out.print(name);
//		
//		
//		
//		Student stu = new Student("Hank", 70, 90);
//		stu.print();
//		
//		System.out.println(3 <= 5);
//		
//		String s1 = new String ("abc");
//		String s2 = new String ("abc");
//		System.out.println(s1==s2);//false
//		System.out.println(s1.equals(s2));//true
		
		
		
		
		
		
//		String name = "Hank";
//		int english = 70;
//		int math = 90;
//		System.out.println(name + "\t" + english + "\t" + math + "\t" + (english + math)/2);
		
		System.out.println("Hello world");
		Person P = new Person(49.5f, 1.7f);
//		P.weight = 49.5f;
//		P.height = 1.6f;
		System.out.println(P.bmi());
		Person F = new Person(65.5f, 1.6f);
		System.out.println(F.bmi());
		P.Hello();
//		Person hank = new Person();
//		Person jack = null;
//		jack.hello();
		
		
		
		
//		String name;
//		name = "Hank";
//		System.out.println(name);
		
		
//		int age = 18;
//		age = age + 1;
//		int schoolYear = 107;
//		float num = 18.5f;
//		float height = 49.5f;
//		System.out.println(age);
//		System.out.println(schoolYear);
//		System.out.println(num);
//		System.out.println(height);
		
		
	}

}
