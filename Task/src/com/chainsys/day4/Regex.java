package com.chainsys.day4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

	public static String NAME_PATTERN = "^[a-zA-Z]+(([',. -][a-zA-Z ])?[a-zA-Z]*)*$";
	public static String EMAIL_PATTERN = "^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,}$";
	public static String PHONE_NUMBER="[89][0-9]{9}";
	public static String PASSWORD="^(?=.*[A-Z])(?=.*[a-z])(?=.*[!@#$%^&*()])(?=.*\\d).{7,}$";
	public static boolean validateName(String name) {
		Pattern pattern = Pattern.compile(NAME_PATTERN);
		Matcher matcher = pattern.matcher(name);
		return matcher.matches();
	}

	public static boolean  validateEmail(String email) {
		Pattern pattern=Pattern.compile(EMAIL_PATTERN);
		Matcher matcher=pattern.matcher(email);
		return matcher.matches();
	}
	public static boolean validatePhoneNumber(String num) {
		Pattern pattern=Pattern.compile(PHONE_NUMBER);
		Matcher matcher=pattern.matcher(num);
		return matcher.matches();
	}
	public static boolean validatePassWord(String pass) {
		Pattern pattern=Pattern.compile(PASSWORD);
		Matcher matcher=pattern.matcher(pass);
		return matcher.matches();
	}

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		String name,email;
		String num;
		int i=0;
		System.out.println("Enter Name(abcd): ");
		name=sc.nextLine();
		while (i < name.length()) {
			char ch = name.charAt(i);
			if (!Character.isLetter(ch)) {
				System.out.println("Only In Alphabet");
				System.out.println("Enter Name(Ex:abcd): ");
				name=sc.nextLine();
				System.out.println("Valid name: " + name);
			}
			i++;
		}
		System.out.println("Enter Email(Ex:abc.xyz@gmail.com): ");
		email=sc.nextLine();
		

		while(!(email.matches(EMAIL_PATTERN)))
		{
			System.out.println("Invalid Data\nRe-enter the mail address : ");
			email=sc.nextLine();
			System.out.println("Valid Email: "+ email);
		}


		
		System.out.println("Enter PhoneNumber(Ten Numbers): ");
		num=sc.nextLine();
		do {
			System.out.println("Enter a phone number (exactly 10 digits): ");
			num = sc.nextLine();

			if (!num.matches("[0-9]+") || num.length() != 10) {
				System.out.println("Invalid input! Please enter exactly 10 digits.");
			}
		} while (!num.matches("[0-9]+") || num.length() != 10);

		System.out.println("Valid phone number: " + num);
		
		System.out.println("Enter a Password: ");
		String pass=sc.nextLine();
		while(!(pass.matches(PASSWORD))) {
			System.out.println("Invalid data! Please Re-enter the Password:");
			pass=sc.nextLine();
	
		}
		
		System.out.println();

		if (validateName(name)) {
			System.out.println("Name is valid.");
		} else {
			System.out.println("Invalid Name.");
		}

		if(validateEmail(email)) {
			System.out.println("Valid Email.");
		}else {
			System.out.println("Invalid Email");
		}
		if(validatePhoneNumber(num)) {
			System.out.println("Valid Number.");
		}else {
			System.out.println("Invalid Number");
		}
		if(validatePassWord(pass)) {
			System.out.println("Valid Password");
		}else {
			System.out.println("Invalid Password");
		}
		sc.close();
	}

}
