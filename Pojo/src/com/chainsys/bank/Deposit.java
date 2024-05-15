package com.chainsys.bank;

import java.util.Random;

public class Deposit {

    public int deposit(long accno, int amount) {
        return amount;
    }

    public static String isRandomNumbers(int num) {
        Random random = new Random(); 
        StringBuilder usernumBuilder = new StringBuilder();
        String charNum = "0123456789";
        for (int n = 0; n < num; n++) {
            int randomIndex = random.nextInt(charNum.length());
            usernumBuilder.append(charNum.charAt(randomIndex));         }
        String userNumber = usernumBuilder.toString();
        return userNumber;
    }

    public void deposit(String BranchName, String IFSC, int amount,String rand) {
        System.out.println("**********************");
        System.out.println("Amount Credited!");
        System.out.println("BranchName: " + BranchName);
        System.out.println("Account Number: "+ rand);
        System.out.println("IFSC: " + IFSC);
        System.out.println("Amount: " + amount);
        System.out.println("Account Number: "+ rand);
    }

	
}
