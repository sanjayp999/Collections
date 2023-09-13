package com.concurrentcollect;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentHashMap.KeySetView;

public class Concurrentpracti extends Thread {
	static ConcurrentHashMap<Integer, String> b= new ConcurrentHashMap<Integer, String>();
	@Override
	public void run() {
		try {
			Thread.sleep(2000);
		}
		catch(InterruptedException e) {}
		System.out.println("child started");
		b.put(5, "yes");
	}
	public static void main(String[] args) throws InterruptedException {
		b.put(2, "sanjay");
		b.put(4, "son");
		
		Concurrentpracti a= new Concurrentpracti();
		
		Thread t= new Thread(a);
		t.start();
		
		KeySetView<Integer, String> keys = b.keySet();
		
		Iterator<Integer> k = keys.iterator();
		while(k.hasNext()) {
			Integer elements = k.next();
			System.out.println("main started"+elements);
			Thread.sleep(2000);
		
	}
			
	}

}
	
