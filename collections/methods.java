package com.collections;
import java.util.ArrayList;
public class methods {
public static void main(String[] args) {
	ArrayList<Object> i=new ArrayList<>();
	i.add("w");
	i.add("w"); //duplicates are allowed
	i.add("w");
	i.add(1);
	System.out.println(i);
	i.add(2, "k");//here k inserted at index 2
	System.out.println(i);//old array preserved
	i.clone();
	
	System.out.println(i);
	System.out.println(i);
	i.set(0, "s");
	
	System.out.println(i);
	i.size();
	i.clear();
System.out.println();
  
}
}
