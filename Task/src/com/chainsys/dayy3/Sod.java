package com.chainsys.dayy3;

import java.util.Scanner;

public class Sod {
	
	public int Add(int num) {
		int sum=0;
		while(num!=0) {
			int result=num%10;
			sum+=result;
			num/=10;
		}
		
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n=sc.nextInt();
		while(n<0) {
			System.out.println("Negative Number!!");
			System.out.println("Enter Valid Number ");
			 n=sc.nextInt();
		}
		Sod s = new Sod();
		System.out.println(s.Add(n));
		
		
		sc.close();
	}

}
