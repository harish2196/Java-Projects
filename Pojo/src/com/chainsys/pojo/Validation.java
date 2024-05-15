package com.chainsys.pojo;

import java.util.regex.Pattern;

public class Validation {
	public boolean Numerics(int regNo1) {
		if(regNo1 < 0)
		{
			System.out.println("Invalid Data");
			return false;
		}
		return true;
	}
	public boolean isDble(double regNo1) {
		if(regNo1 < 0)
		{
			System.out.println("Invalid Data");
			return false;
		}
		return true;
	}
	public static boolean validateString(String input) {
        String regex = "^[a-zA-Z ]+$";
        Pattern pattern = Pattern.compile(regex);       
        if (!pattern.matcher(input).matches()) {
            System.out.println("Error: Input should contain only spaces and letters.");
            return false;
        } else {
            return true;
        }
    }

	public boolean longNumerics(long regNo1) {
		if(regNo1 < 0)
		{
			System.out.println("Invalid Data");
			return false;
		}
		return true;
	}
	public  boolean stringChecker(String s) 
	{
		try
		{
			Integer.parseInt(s);
			System.out.println("Dont use numbers");
			return false;

		}
		catch(Exception e){

			return true;

		}
	}

	public boolean isSpecialChar(String input)
	{

		String specialCharRegex = "^[^a-zA-Z0-9]+[!@#$%^&*()]+$";
		if(Pattern.matches(specialCharRegex, input))
		{
			System.out.println("Invalid!.Dont use Special Characters");
			return false;
		}
		return true;
	}

}
