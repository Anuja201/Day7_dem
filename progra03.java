package com.dkte.demo3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class program03 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double d;
		double n;
		try{
			System.out.print("Enter the numnerator - ");
			n = sc.nextDouble();
			System.out.print("Enter the denominator - ");
			d = sc.nextDouble();
			double result=d/n;
			System.out.println("Result :"+result);
	    }catch(ArithmeticException e) {
	    	System.out.println("Cannot divide by 0");
	    }catch(InputMismatchException e) {
	    	System.out.println("Numbers are required...");
	    }
		System.out.println("Program Finishing");
		sc.close();
	}

}
