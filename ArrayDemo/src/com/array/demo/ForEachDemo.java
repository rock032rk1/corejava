package com.array.demo;


import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachDemo {

	public static void main(String[] args) {
		
		Map<Integer,String> map=new HashMap<Integer, String>();
		
		map.put(1,"Rakesh");
		map.put(2,"Satish");
		map.put(3,"Nobita");
		map.put(4,"Prakash");
		
//		System.out.println("1st Method to Print Data");
//		map.forEach((key,value)->System.out.println(key+" "+value));
//		
//		System.out.println("2nd Method to Print Data");
//		map.entrySet().stream().forEach(obj->System.out.println(obj));
		
		List<String> list=Arrays.asList( 
				"Rakesh","Satish","Prakash","Nobita");
		
		list.forEach(a->System.out.println(a));
		
		
	}
}
