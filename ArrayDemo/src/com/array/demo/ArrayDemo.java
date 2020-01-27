package com.array.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayDemo {

	public static void main(String[] args) {
		
		ArrayList li=new ArrayList();
		li.add("A");
		li.add("B");
		li.add("C");
		li.add("B");
		li.add("A");
		
		
		Iterator itr=li.iterator();
		int count=0;
		int count1=0;
		int count2=0;
		while(itr.hasNext()) {
			String s=(String) itr.next();
			if(s.equals("A")) {
				count++;
				count=count+0;
				
			}else if(s.equals("B")) {
				count1++;
				count1=count1+0;
			}
			else if(s.equals("C")) {
				count2++;
				count2=count2+0;
			}
			
		}
		System.out.println("Count of A is= "+count);
		System.out.println("Count of B is "+count1);
		System.out.println("Count of C is "+count2);
	}
	
}
