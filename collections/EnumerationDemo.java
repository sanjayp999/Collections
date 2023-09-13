package com.collections;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {
	public static void main(String[] args) {
		
		Vector<Object> v=new Vector<>();
//		for(int i=1;i<=5;i++) {
//			v.add(i);
//		}
		v.addElement("mohan");
		v.addElement("sanjay");
		v.addElement("naveen");
		
		System.out.println(v);
	
		Enumeration d= v.elements();
		
		while(d.hasMoreElements()) {
	String i=(String) d.nextElement()	;
		
	System.out.print(i+" ");
	}
	}
}
