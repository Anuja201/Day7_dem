package com.dkte.demo3;


import java.util.Scanner;

public class program05 {

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
	    }finally {
	    	System.out.println("InSide Finishing");
	    	sc.close();
	    }
		System.out.println("Program Finishing");
		
	}

}