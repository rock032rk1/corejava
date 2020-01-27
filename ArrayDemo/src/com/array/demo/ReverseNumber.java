package com.array.demo;

import java.util.ArrayList;
import java.util.Iterator;

public class ReverseNumber {

	public static void main(String[] args) {
		
		ArrayList<Integer> li=new ArrayList<Integer>();
		li.add(1);
		li.add(2);
		li.add(1);
		
//		Iterator<Integer> itr=li.iterator();
//		
//		while(itr.hasNext()) {
//			Integer it=itr.next();
//			System.out.println(it);
//			
//		}
		
		int no=121;
		int s=no%10;
		int a=no/10;
		int b=a%10;
		System.out.println("Value of S :"+s);
		System.out.println("Value of A :"+a);
		System.out.println("Value of B :"+b);
		
		
		int r,sum=0,temp;    
		  int n=454;//It is the number variable to be checked for palindrome  
		  
		  temp=n;    
		  while(n>0){    
		   r=n%10;  //getting remainder  
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(temp==sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");
		
	}
}
