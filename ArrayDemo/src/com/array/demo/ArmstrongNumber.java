package com.array.demo;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		int r,temp,sum=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the No");
		int n=sc.nextInt();
		
		temp=n;
		while(n>0) {
			r=n%10;
			sum=(r*r*r)+sum;
			n=n/10;
		}
		
		if(temp==sum) {
			System.out.println("Its a Armstrong No");
		}else {
			System.out.println("Its not a Armstrong no");
		}
	}
}
