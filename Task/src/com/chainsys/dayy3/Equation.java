package com.chainsys.dayy3;

import java.util.Scanner;

public class Equation {

	public static void main(String[] args) {

	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Staring: ");
	        int staring = scanner.nextInt();
	        System.out.print("Upto: ");
	        int to = scanner.nextInt();
	        
	        for(int i=staring; i<=to; i+=1)
	        {
	            int res = 2 * i * i + i + 5;
	            System.out.print(res+ " ");
	        }
	       
	}

}
