package com.chainsys.practicingtask;

import java.util.Scanner;

public class StringTokens {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		// Write your code here.
		scan.close();
		String arr[] = s.trim().split("[ !,?._'@]+");

		if(s.trim().equals("")) {
			System.out.println(0);
		}   else {
			System.out.println(arr.length);
		}

		for(int i=0; i< arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
