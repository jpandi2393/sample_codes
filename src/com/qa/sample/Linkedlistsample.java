package com.qa.sample;

import java.util.LinkedList;

public class Linkedlistsample {

	public static void main(String[] args) {

		LinkedList<Integer> li = new LinkedList<Integer>();
		
		li.add(50);
		li.add(100);
		li.add(150);
		
		System.out.println("Linked list data is" +li);
		
		li.addFirst(25);
		
		li.addLast(200);
		
		System.out.println("Linked list data is" +li);
		
		
		
		System.out.println("Linked list get  data is" +li.get(0));
		
		System.out.println("Linked list set data is" +li.set(1, 150));

		System.out.println("Linked list data is" +li);
		
		for (int i=0;i<li.size();i++)
			
		{
			
			System.out.println(li.get(i));
			
			
	}
	

		for(Integer i:li)
			
		{
			System.out.println(li);

		}
		
		}
}

