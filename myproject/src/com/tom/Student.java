package com.tom;

public class Student {
	String name;
	int english;
	int math;
	
	public Student (String name,int english,int math){
		this.name = name;
		this.english=english;
		this.math=math;
		
	}
	
	public void print(){
		System.out.print(name + "\t" + english + "\t" + math + "\t" + highest() + "\t" + getAverage() +"\t");
		if(getAverage() > 60){
			System.out.println("Pass");
		}else{
			System.out.println("Failed");
		}
	}
	
	public int highest(){
		if(english < math){
			return english;
		}else{
			return math;
		}
	}
	
	public int getAverage(){
		return (english + math)/2;
	}

	
}
