package com.chainsys.dayy3;

public class Validation {

	

	public boolean Numbers(int Number) {
        if(Number < 0)
        {
            System.out.println("Negative Number...");
            return false;
        }
        return true;
    }
    
    public void String(String Str)
    {
        if(Str == "")
        {
            System.out.println("String Cannot be Empty");
        }
    }
    
    public boolean Double(double Number) {
        if(Number < 0)
        {
            System.out.println("Negative Number...");
            return false;
        }
        return true;
    }
}