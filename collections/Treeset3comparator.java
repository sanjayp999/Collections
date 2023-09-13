package com.collections;
import java.util.TreeSet;
public class Treeset3comparator {
	public static void main(String[] args) {
		
		TreeSet <Integer> t=new TreeSet<>(new Comparator1());//passing comparator 1
		t.add(10);
		t.add(0);
		t.add(15);
		t.add(5);
		t.add(20);
		
		System.out.println(t);// it maintains(ascending order)
	}

}
