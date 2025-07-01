package com.dkte.demo3;



public class program02 {

	public static void main(String[] args) {
		double d=10;
		double n=0;
		try{
			double result=d/n;
			System.out.println("Result :"+result);
	    }catch(ArithmeticException e) {
	    	System.out.println("Cannot divide by 0");
	    }
		System.out.println("Program Finishing");
		
	}

}
