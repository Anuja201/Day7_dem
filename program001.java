package com.dkte.demo4;

class Date{
	int day;
	int month;
	int year;
	
	public void setDay(int day) {
		if(day <=0 || day >31) 
			throw new RuntimeException();//(uncheckd exception )generate an exception
		this.day=day;
	}
	public void setMonth(int month) throws Exception {
		if (month <= 0 || month > 12)
			throw new Exception(); // checked exception
		this.month = month;
	}
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getDay() {
		return day;
	}
	public int getMonth() {
		return month;
	}
	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
	
	
}
public class program01 {

	public static void main(String[] args) {

		Date d1=new Date();
		d1.setYear(2025);
		d1.setDay(20);
		try {
			d1.setMonth(12);
			System.out.println(d1);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
