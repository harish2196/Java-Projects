package com.chainsys.day4;

import java.util.Scanner;
import java.util.stream.IntStream;

public class StringMethods {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str="hiHeLlo";
		String str1="hello";
		//charAt
//		System.out.println("Enter a String: ");
//		String str=sc.nextLine();
//		System.out.println("Enter CharAt Index: ");
//		int n=sc.nextInt();
		System.out.print("charAt: ");
		System.out.println(str.charAt(4));
		//chars
		System.out.print("chars: ");
		System.out.println(str.chars());
		//charpointAt
		System.out.print("charpointAt: ");
		int result=str.codePointAt(1);
		System.out.println(result);
		//codePointBefore​
		int res=str.codePointBefore(2);
		System.out.println(res);
		//codePointCount​
		 res=str.codePointCount(0,6);
		 System.out.println(res);
		 //codePoints
		 System.out.println("ASCII Values: ");
		 IntStream stream = str.codePoints(); 
		 stream.forEach(System.out::println); 
		 //	compareTo​
		 System.out.print("CompareTo: ");
		 int comparison = str.compareTo(str1);
		 
	        if (comparison < 0) {
	            System.out.println(str + " comes before " + str1 );
	        } else if (comparison > 0) {
	            System.out.println(str + " comes after " + str1 );
	        } else {
	            System.out.println(str + " and " + str1 );
	        }
	        //compareToIgnoreCase​
	        System.out.print("compareToIgnoreCase: "); 
	        System.out.println(str.compareToIgnoreCase(str1));
	        //concat​
	        System.out.println(str.concat(str1));
	        //contains
	        System.out.print("Contains: ");
	        System.out.println(str.contains("helo"));
	        //Equals
	        System.out.print("contentEquals: ");
	        System.out.println(str.contentEquals("hihello"));
	        //copyValueOf
	        System.out.print("copyOf: ");
	        char[] charArray = {'H', 'e', 'l', 'l', 'o'};
	        String strr = String.copyValueOf(charArray);
	        System.out.println(strr);
	        //copyvalueOf using int
	        System.out.print("copyValueOf: ");
	        char[] Array = {'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd'};
	        String strrr = String.copyValueOf(Array, 0, 7);
	        System.out.println(strrr);
	        //Endswith
	        System.out.print("EndsWith: ");
	        System.out.println(str.endsWith("hello")); 
	        //Equals
	        System.out.print("Equals: ");
	        System.out.println(str.equals("hihello")); 
	        //equalsIgnoreCase​
	        System.out.print("EqualsIgnoreCase: ");
	        System.out.println(str.equalsIgnoreCase("Hihello")); 
	        //format
	        System.out.print("stringFormat: ");
	        String formatted = String.format("Hello, %s! Today is %s.", "Alice", "Monday");
	        System.out.println(formatted); 
	        System.out.print("NumberFormat: ");
	        int number = 42;
	        String formattedNo = String.format("The answer to life, the universe, and everything is %d.", number);
	        System.out.println(formattedNo);
	        //indexOf
	        System.out.print("indexOf: ");
	        int index = str.indexOf('o');
	        System.out.println(index);
	        //indexOf
	        System.out.print("indexOf: ");
	        int ind = str.indexOf('o', 7); 
	        System.out.println(ind);
	        //upperCase
	        System.out.println("UpperCase: ");
	        System.out.println(str.toUpperCase());
	       //lowerCase
	        System.out.println("LowerCase: ");
	        System.out.println(str.toLowerCase());
	        
	        
	        
	        
	        
	        
	        
		sc.close();
	}

}
