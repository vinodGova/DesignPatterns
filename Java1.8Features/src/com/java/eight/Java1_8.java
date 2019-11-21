package com.java.eight;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;

public class Java1_8 {

	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<>();
		
		al.add("vinod");
		al.add("hari");
		al.add("madhu");
		al.add("naveen");
		
		
		Iterator<String> items=al.iterator();
		//Traversing with iterator
		while(items.hasNext())
		{
			String name=items.next();
			System.out.println(name);
		}
		
		//Traversing with forEach
		
		al.forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println("with using forEach  "+t);
				
			}
		});
	
	}
}
