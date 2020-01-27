package com.array.demo;

import java.util.Scanner;

public class FactorialNumberDemo {

	public static void main(String[] args) {
		
//		  int i,fact=1;  
//		  int number=5;//It is the number to calculate factorial    
//		  for(i=1;i<=number;i++){    
//		      fact=fact*i;    
//		  }    
//		  System.out.println("Factorial of "+number+" is: "+fact);   
		
		int i,fact=1;
		System.out.println("Enter the No");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for(i=1;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println("Factorial of :"+n+" is: "+fact);
		
		
	}
}
