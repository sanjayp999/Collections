package com.collectionsLists;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
	public static void main(String[] args) {
		ArrayList<Object> a= new ArrayList<>();
		
		a.add("hii");
		a.add("hshhs");
		a.add("jkhs");
		
		System.out.println(a);
		
		Iterator<Object> s=a.iterator();
		 while(s.hasNext()) {
	      String d=(String)s.next(); 
	      System.out.print(d+" ");
		
		 }
		}
}
