package com.array.demo;

public class StringDemo {

	public static void main(String[] args) {
		
		char ch[]= {'S','t','r','i','n','g'};
		String s=new String(ch);
		
		System.out.println(s);
		
	//	Concatinaton of String
		
		String s1="Sachin";
		String s2="Tendulakar";
		String s3=s1.concat(s2); // it is used for concate the two string concat()
		
		System.out.println(s3); 
		
		
	// Subtring Method return the start index and end index value of String
		
		String s4=s1.substring(3);
		System.out.println(s4);
		
	//Reverse A String Demo
		
		String s0="Sachin";
		String rev="";
		
		for(int i=s0.length()-1;i>=0;i--) {
			rev=rev+s0.charAt(i);
		}
		System.out.println("Reverse String Is");
		System.out.println(rev);
	}
}
