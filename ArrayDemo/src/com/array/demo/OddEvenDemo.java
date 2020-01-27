package com.array.demo;

import java.util.Scanner;

public class OddEvenDemo {

	public static void main(String[] args) {
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the No");
//		int n=sc.nextInt();
//		
//		if(n%2==0) {
//			System.out.println("Its a Even No");
//		}else {
//			System.out.println("Its a Odd No");
//		}
		
		//Check weather no is Odd or Even through Arraaaay
		
		int a[]= {1,5,2,7,8,10,11,16};
		
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				System.out.println("Its an Even No :"+a[i]);
			}else {
				System.out.println("its an Odd No :"+a[i]);
			}
		}
	}
}
