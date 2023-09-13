package com.collections;
import java.util.TreeSet;
public class Treeset {
	public static void main(String[] args) {
		TreeSet<String> a= new TreeSet<>();
		a.add("h");
		a.add("b");
		a.add("c");
		a.add("a");
		a.add("44");
		//	a.add(null);//not possible
		System.out.println(a);
	}
	//// all are printed in a sorted manner
	/////no null insertions and heterogenous objects
}
