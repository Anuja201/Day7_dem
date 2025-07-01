package com.dkte.demo3;

import java.util.Scanner;

public class program06 {

	public static void main(String[] args) {
		
		double d;
		double n;
		try(Scanner sc=new Scanner(System.in);){
			
			System.out.print("Enter the numnerator - ");
			n = sc.nextDouble();
			System.out.print("Enter the denominator - ");
			d = sc.nextDouble();
			double result=d/n;
			System.out.println("Result :"+result);
	    }
		System.out.println("Program Finishing");
		
	}

}