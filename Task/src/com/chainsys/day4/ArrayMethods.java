package com.chainsys.day4;

import java.util.Arrays;
import java.util.List;

public class ArrayMethods {

	public static void main(String[] args) {
//		//asList
//		String a[] = new String[]{"abc","klm","xyz","pqr"};
//		List<String> list = Arrays.asList(a);
//		System.out.println("The list is:" + list);
//		//binarySearch
//		int[] b= {2,-3,1,3,6,-5};
//		System.out.println("BinarySearch: " + Arrays.binarySearch(b, 2));
//		System.out.println("BinarySearch: " + Arrays.binarySearch(b, 3));
//		//compare
//		int[] array1 ={6, 7, 8, 11, 18, 8, 2, 5};        
//		int[] array2 ={3, 5, 9, 13, 28, 6, 8, 9};     
//		System.out.println("Result is "+ Arrays.compare(array1,array2));

		int lcm,num1=3;
		int num2=4;
		int max=num1>num2 ? num1:num2;
		while(true) {
			if((max%num1==0) && (max%num2==0)) {
				lcm=max;
				break;
			}
			max++;
		}
		System.out.println(max);

	}

}
