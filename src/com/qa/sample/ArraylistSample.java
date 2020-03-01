package com.qa.sample;

import java.util.ArrayList;
import java.util.Iterator;

import ArrayList.Employee;



public class ArraylistSample {

	public static void main(String[] args) {
		
		ArrayList<Integer> ar = new ArrayList<Integer>();
		
		ar.add(10);
		ar.add(20);
		ar.add(30);
		
      System.out.println("Size of arraylist is" + ar.size());
      
      System.out.println(ar.get(2));
      
      for(int i=0;i<ar.size();i++)

      {
    	  System.out.println(ar.get(2));
    	  
      }
      
      
      //To define generic array
      
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		
		ar1.add(50);
	//	ar1.add("sss"); --> not allowed
		
		ArrayList<String> ar2 = new ArrayList<String>();
		
		ar2.add("Hello");
		
		// ar2.add(50);  --> not allowed
		
		//Employee class objects
		
		Employee e1 = new Employee("pandi",26,"QA");
		Employee e2 = new Employee("Kumar",29,"Dev");
		Employee e3 = new Employee("Tommy",30,"Prod");
		
		
		ArrayList<Employee> ar3 = new ArrayList<Employee>();
		ar3.add(e1);
		ar3.add(e2);
		ar3.add(e3);

		
		//Iterator is like 'for' loop to traverse the all values
		
		Iterator<Employee> it = ar3.iterator();
		while(it.hasNext())
		{
			Employee emp = it.next();
			
			System.out.println(emp.ename);
			System.out.println(emp.age);
			System.out.println(emp.dept);


		}
		
		
		
		
		
	
		
		
		

      

	}

}
