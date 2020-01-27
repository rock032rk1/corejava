package com.array.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ForEachStreamFilterMethod {

	public static void main(String[] args) {
		
		List<String> list=new ArrayList<String>();
		
		list.add("Apple");
		list.add("Banana");
		list.add("Grapes");
		list.add("Guava");
		list.add("PineApple");
		
		//we can take list element in this way also
		List<String> list1=Arrays.asList("Rakesh","Satish","Manish","Prakash","Rama");
	     
		// startWith method find the String in list object which we want to find
//		list1.stream().filter(t->t.startsWith("R")).forEach(t->System.out.println(t));
		
		//findFirst() print the 1st element & ifPresent() return true or false if value is present
		//list1.stream().findFirst().ifPresent(t->System.out.println(t));;
		
//		list1.forEach(t->System.out.println(t));
		
		//Simple Process To Print the List
		//System.out.println("Simple process For Print The data");
//		for(String s:list) {
//			
//			//System.out.println(s);
//		}
		
		//For Each method to print the Data
		//System.out.println("ForEach Method for Print the data");
		//list.stream().forEach(t->System.out.println(t));
		
		
		//For Map Object
		
		Map<Integer,String> map=new HashMap<Integer, String>();
		
		map.put(1,"A");
		map.put(2,"B");
		map.put(3,"C");
		map.put(4,"D");
		
		//1st Appoarch To print The Map Data
//		System.out.println("1st Appoarch To Print Data");
//		map.forEach((key,value)->System.out.println(key+" "+value));
		
		//2st Appoarch To print The Map Data
//		System.out.println("2st Appoarch To Print Data");
//		map.entrySet().stream().forEach(obj->System.out.println(obj));
		
		
		List<String> li=Arrays.asList("A","B","C","A","D","A","B");
		List<String> li1=new ArrayList<String>();
		li1.add("Modern humans arrived on the Indian subcontinent from Africa no later than 55,000 years ago.[21] Their long occupation, initially in varying forms of isolation as hunter-gatherers, has made the region highly diverse, second only to Africa in human genetic diversity.[22] Settled life emerged on the subcontinent in the western margins of the Indus river basin 9,000 years ago, evolving gradually into the Indus Valley Civilisation of the third millennium BCE.[23] By 1200 BCE, an archaic form of Sanskrit, an Indo-European language, had diffused into India from the northwest, unfolding as the language of the Rigveda, and recording the dawning of Hinduism in India.[24] The Dravidian languages of India were supplanted in the northern regions.[25] By 400 BCE, stratification and exclusion by caste had emerged ");
		//int count=0;
		//li.stream().filter(a->a.equals("A")).forEach((a->System.out.println(a+" "+count)));
		//li.stream().filter(a->a.equals("A")).forEach(a->System.out.println(a));
//		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter the Character");
//		String c=sc.nextLine();
//		String rv=" ";
//		long ct=0;
		
//		for(int i=c.length()-1;i>=0;i--) {
//			String rv1="";
//			rv1=rv1+c.charAt(i);
//			//System.out.println(rv);
//			//long ct=li.stream().filter(a->a.equalsIgnoreCase(rv)).count();
//			//long ct1=li.stream().filter(a->a.equalsIgnoreCase(rv)).count();
//			//System.out.println("The No of "+rv1.toUpperCase()+" is ");
//		}
		/*
		 * String y="Yes"; do { Scanner sc1=new Scanner(System.in);
		 * System.out.println("Ente the Alpha"); String a=sc.nextLine(); long
		 * c1=li.stream().filter(a1->a1.equalsIgnoreCase(a)).count();
		 * System.out.println("The No of "+a.toUpperCase()+" is "+c1);
		 * 
		 * System.out.println("Do you want to continue"); y=sc.nextLine(); } while
		 * (y.equalsIgnoreCase("Yes"));
		 */
		
		
		//it will print and count character
		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the character");
//		String ch=sc.nextLine();
//		String c1="";
//		for(int i=ch.length()-1;i>=0;i--) {
//			c1="";
//			c1=c1+ch.charAt(i);
//			String temp=c1;
//			//System.out.println(c1);
//			long c2=li.stream().filter(a1->a1.equalsIgnoreCase(temp)).count();
//			System.out.println("The No of "+c1.toUpperCase()+" is "+c2);
//		}
		String l="India the";
		String y="yes";
		do {
			System.out.println("Enter 1 for print and count the Cahracter");
			System.out.println("Enter 2 for find out the String and count");
			int one=Integer.parseInt(sc.nextLine());
			
			switch (one) {
			case 1:
				System.out.println("Enter the character");
				String ch=sc.nextLine();
				String c1="";
				for(int i=ch.length()-1;i>=0;i--) {
					c1="";
					c1=c1+ch.charAt(i);
					String temp=c1;
					//System.out.println(c1);
					long c2=li.stream().filter(a1->a1.equalsIgnoreCase(temp)).count();
					System.out.println("The No of "+c1.toUpperCase()+" is "+c2);
				}
				
				break;
			case 2:
				System.out.println("Enter the string to find");
				String str=sc.nextLine();
				li1.stream().filter(d->d.startsWith("the")).forEach(d->System.out.println(d));
                String st=l.substring(1);
			default:
				System.out.println("Envalid option");
				break;
			}
			System.out.println("Do you want to continue");
			y=sc.nextLine();
			
		} while (y.equalsIgnoreCase("yes"));
		//abdc
		//long c2=li.stream().filter(a1->a1.equalsIgnoreCase("a")).count();
		
		//long ct=li.stream().filter(a->a.equalsIgnoreCase(c1)).count();
		//System.out.println("The No of "+c1.toUpperCase()+" is "+ct);
		
		
		//System.out.println();
		//li.stream().filter(b->b.equals("A")).forEachOrdered(b->System.out.println(b));
		//count++;
		
		
		
	}
}
