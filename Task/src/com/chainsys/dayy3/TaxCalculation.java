package com.chainsys.dayy3;

import java.util.Scanner;

public class TaxCalculation {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your gross salary: ");
		double grossSalary = sc.nextDouble();

		System.out.print("Enter your total savings: ");
		double totalSavings = sc.nextDouble();

		double tax = taxCalculator(grossSalary, totalSavings);

		System.out.println("Your tax amount is: Rs. " + tax);

		sc.close();
	}
	public static double taxCalculator(double grossSalary, double totalSavings) {
		double taxableIncome = Math.max(grossSalary - Math.min(totalSavings, 100000),0);
		double tax = 0;

		if (taxableIncome <= 100000) {
			tax = 0;
		} else if (taxableIncome > 100000 && taxableIncome <= 200000) {
			tax = 0.1 * (taxableIncome - 100000);
		} else if (taxableIncome > 200000 && taxableIncome <= 500000) {
			tax = 0.1 * (200000 - 100000) + 0.2 * (taxableIncome - 200000);
		} else {
			tax = 0.1 * (200000 - 100000) + 0.2 * (500000 - 200000) + 0.3 * (taxableIncome - 500000);
		}

		return tax;
	}
}


