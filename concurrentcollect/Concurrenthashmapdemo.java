package com.concurrentcollect;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class Concurrenthashmapdemo extends Thread{
	
		//static HashMap<Integer, String> m = new HashMap(); //java.util.concurrent Modification Exception
		static ConcurrentHashMap<Integer, String> m = new ConcurrentHashMap();
		public void run() {
		 try {
		 Thread.sleep(2000);
		 }
		 catch (InterruptedException e) {}
		 System.out.println("Child Thread updating Map");
		 m.put(103, "C");
		}
		public static void main(String[] args) throws InterruptedException {
		 m.put(101,"A");
		 m.put(102, "B");
		 
		 
		 Concurrenthashmapdemo t = new Concurrenthashmapdemo();
		 Thread t1= new Thread(t);
		 t1.start();
		 Set s = m.keySet();
		 Iterator itr=s.iterator();
		 while (itr.hasNext()) {
		 Integer I1 = (Integer) itr.next();
		 System.out.println("Main Thread iterating and Current Entry is:"+ I1);
		 Thread.sleep(1000); 
	}
		 

}
}