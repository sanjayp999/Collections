package com.concurrentcollect;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class Copyonarraykistdemo {
	public static void main(String[] args) {
		//ArrayList a=new ArrayList();
		CopyOnWriteArrayList a= new CopyOnWriteArrayList();
		a.add(1);
		a.add(5);
		a.add(7);
		a.add(3);
		
		Iterator e = a.iterator();
		a.add(9);
		
		while(e.hasNext()) {
			Object next = e.next();
			System.out.println(next);
		}
	}

}
