package com.chainsys.day4;

import java.util.Scanner;

public class TeenNumber {


	public boolean isTeen(int num) {
		if(num>=13 && num<=19)
		{
			return true;
		}
		return false;
	}

	public boolean hasTeen(int number1, int number2, int number3) {
		if(number1>=13 && number1<=19 || number2>=13 && number2<=19 || number3>=13 && number3<=19)
		{
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Age:");
		int isteen=sc.nextInt();

		System.out.println("Enter the A1:");
		int a1=sc.nextInt();
		System.out.println("Enter the A2:");
		int a2=sc.nextInt();
		System.out.println("Enter the A3:");
		int a3=sc.nextInt();
		TeenNumber teen=new TeenNumber();
		System.out.println(teen.isTeen(isteen));
		System.out.println(teen.hasTeen(a1,a2,a3));
		sc.close();
	}
}
