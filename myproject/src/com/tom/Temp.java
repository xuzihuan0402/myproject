package com.tom;

public class Temp {
	double celsius;
	
	public Temp(double celsius){
		this.celsius = celsius;
		
	}
	
	public double fahrenheit(){
		double f = celsius*(9/5.0)+32;
		return f;
		
	}
	public double kelvin(){
		return celsius+273.15;
	}

}
