package com.array.demo;

import java.util.Scanner;

public class ReverseNumber1 {

	public static void main(String[] args) {
		
		int r,sum=0,temp;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The No");
		int no=sc.nextInt();
		
		temp=no;
		
		while(no>0) {
			r=no%10;
			sum=(sum*10)+r;
			no=no/10;
		}
		if(temp==sum) {
			System.out.println("Its Pallidrome No");
		}else {
			System.out.println("Its nOt Pallidrome No");
		}
	}
}
