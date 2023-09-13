package com.collectionsLists;
import java.util.Stack;
public class StackDemo {
	public static void main(String[] args) {
		
		Stack<Object> s=new Stack<>();
		s.push("d");
		s.push("hello");
		s.push("f");
		s.pop();
		s.peek();
		
		System.out.println(s);
	
		}

}
