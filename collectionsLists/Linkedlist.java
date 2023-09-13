package com.collectionsLists;
import java.util.LinkedList;
public class Linkedlist {
	public static void main(String[] args) {
		
		
		LinkedList<Object> a=new LinkedList<>();

		a.add(0, "s");
		a.add("sanjay");
		a.addFirst("hello");
		a.addLast("bye");
		//a.clear();
		System.out.println(a);
		a.clone();
		System.out.println(a);
		a.set(0, "jack");
		a.removeLast();
		System.out.println(a);
	}

}
