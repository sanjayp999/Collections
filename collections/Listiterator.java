package com.collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class Listiterator {
		public static void main(String[] args) {
			LinkedList ll = new LinkedList();
	        ll.add("Navya");
	        ll.add("Jyothsna");
	        ll.add("Srilatha");
	        ll.add("Anusha");
	        System.out.println(ll);
	        ListIterator itr=ll.listIterator();
	        while(itr.hasNext()) {
	        	String s=(String)itr.next();
	        	if(s.equals("Srilatha")) {
	        		itr.remove();
	        	}
	        	else if(s.equals("Navya")) {
	        		itr.set("Vilasini");
	        	}
	        }
	        System.out.println(ll);
	        System.out.println(itr.nextIndex());
	        System.out.println(itr.previousIndex());
	        
	        
	        while(itr.hasPrevious()) {
	        	String s1=(String)itr.previous();
	        	if(s1.equals("Jyothsna")) {
	        		itr.add("Sunny");
	        	}
	        	else if(s1.equals("Sunny")) {
	        		itr.add("Bunny");
	        	}
	        }
	        System.out.println(ll);
	        System.out.println(itr.previousIndex());

		}

	}
