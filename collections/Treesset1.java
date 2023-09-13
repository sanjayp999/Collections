package com.collections;
import java.util.TreeSet;
public class Treesset1 {

	public static void main(String[] args) {
		TreeSet<StringBuffer> t =new TreeSet<>();
		t.add(new StringBuffer("A"));
		t.add(new StringBuffer("B"));
		t.add(new StringBuffer("Z"));
		t.add(new StringBuffer("I"));
		t.add(new StringBuffer("A"));
		t.add(new StringBuffer("a"));
		
	System.out.println("A".compareTo("Z"));	//(-)obj 1 has come before obj 2
	System.out.println("Z".compareTo("A"));//  (+)Obj 1 came after obj 2
	System.out.println("a".compareTo("A"));
	System.out.println("A".compareTo("A"));//(0)obj1=obj2
	}
	
	}

