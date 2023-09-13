package com.collections;

public class Wrapperboxingandunboxing {

	public static void main(String args[]){  
		Integer i=new Integer(50); // wrapper class
		int a=i;  //unboxing

		int b =10;   //primitive datatype
		Integer d=new Integer(b);//converting into wrapper class
		//boxing

		int c=80;
		Integer e=Integer.valueOf(c);//boxing

		Integer y=45;
		int h=y.intValue();


		System.out.println(a); 
		System.out.println(b);
		System.out.println(h);
		System.out.println(e);
	}    
}  

