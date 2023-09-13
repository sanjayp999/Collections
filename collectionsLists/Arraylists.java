package com.collectionsLists;
import java.util.LinkedList;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.RandomAccess;
public class Arraylists {
	
	public static void main(String[] args) {
		
		ArrayList<Object> A=new ArrayList<>();
		LinkedList<Object>B=new LinkedList<>();
		
		System.out.println(A instanceof Serializable);
		System.out.println(A instanceof Cloneable);
		System.out.println(A instanceof RandomAccess);
	
		System.out.println(B instanceof Serializable);
		System.out.println(B instanceof Cloneable);
		System.out.println(B instanceof RandomAccess);
}
}