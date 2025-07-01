package com.dkte.demo1;

import java.util.Scanner;

interface Acceptable{
	void accept(Scanner sc);
}

interface Displayable{
	void display();
}

class Date implements Acceptable,Displayable{
	int day;
	int month;
	int year;
	
	@Override
	public void accept(Scanner sc) {
		System.out.println("Enter the day:");
		this.day=sc.nextInt();
		System.out.println("Enter the month:");
		this.month=sc.nextInt();
		System.out.println("Enter the year:");
		this.year=sc.nextInt();
	}
	
	@Override
	public void display() {
		System.out.println("Date :: "+day+"/"+month+"/"+year);
	}
	
}
class Time implements Acceptable{
	int hr;
	int min;
	
	@Override
	public void accept(Scanner sc) {
		System.out.println("Enter the hr:");
		this.hr=sc.nextInt();
		System.out.println("Enter the min:");
		this.min=sc.nextInt();
	}

}
class Employee implements Acceptable, Displayable {
	int id;
	String name;

	@Override
	public void accept(Scanner sc) {
		System.out.println("Enter the ID:");
		this.id=sc.nextInt();
		System.out.println("Enter the Name:");
		this.name=sc.next();
		sc.nextLine();
	}

	@Override
	public void display() {
		System.out.println("Employee :: Id-"+id+",Name-"+name);
	}

}
public class program01 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Acceptable a1 = new Date();//upcasting
		a1.accept(sc);
		Displayable d1 = (Displayable) a1;//downcasting
		d1.display();

		// Time
		a1 = new Time();
		a1.accept(sc);

		// Employee
		Acceptable a2 = new Employee();
		a2.accept(sc);
		Displayable d2 = (Displayable) a2;
		d2.display();
	
	}
}
