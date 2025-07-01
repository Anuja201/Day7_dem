package com.dkte.demo1;

interface I1{
	
}
interface I2{

}
interface I3 extends I1,I2{
	
}
class c1{
	
}
class c2{
	
}
class c3 extends c1 implements I1,I2{
	
}

public class program02 {

	public static void main(String[] args) {
		// class c3 extends c1   //Ok
		//class c3 extends c1,c2  //Not Ok
		//class c3 extends I1     // ok
		//class c3 extends I1,I2 //Not Ok
		//class c3 Implements I1//Ok
		//class c3 implements I1,I2  //Ok
		
		//interface I3 implements I1  // Not Ok
		//interface I3 implements I1,I2 //NOt ok
		//interface I3 implements c1  //Not ok
		//interface I3 implements c2,c1 //not ok
		//interface I3 extends c1 //not ok
		//interface I3 extends c1,c2 //not ok
		//interface I3 extends I1 // ok
		//interface I3 extends I1,I2 // ok
		
//		class C3 extends C1 implements I1, I2// OK
//		class C3 implements I1, I2 extends C1 // NOT OK
		

	}

}
