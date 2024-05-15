package com.chainsys.bank;

import java.util.Scanner;

import com.chainsys.pojo.Validation;

public class User {

    public static void main(String[] args) {
        Bank bankDetails = new Bank();
        Validation v1 = new Validation();
        Scanner sc = new Scanner(System.in);
        String name1, IFSC1;
        long accno;
        int amount;
        int rndLimit;

        while (true) {
            System.out.println("Enter the name:");
            name1 = sc.nextLine();
            if (v1.validateString(name1)) {
                bankDetails.setBranchName(name1);
                break;
            }
        }

        while (true) {
            System.out.println("Enter the IFSC code:");
            IFSC1 = sc.nextLine();
            if (v1.stringChecker(IFSC1)) {
                bankDetails.setIFSC(IFSC1);
                break;
            }
        }

        while (true) {
            System.out.println("Enter the Accno:");
            accno = sc.nextLong();
            if (v1.longNumerics(accno)) {
                bankDetails.setAccNo(accno);
                break;
            }
        }

        while (true) {
            System.out.println("Enter the regno:");
            amount = sc.nextInt();
            if (v1.Numerics(amount)) {
                bankDetails.setAmount(amount);
                break;
            }
        }

        while (true) {
            System.out.println("Enter the rndLimit:");
            rndLimit = sc.nextInt();
            if (v1.Numerics(rndLimit)) {
                bankDetails.setRand(rndLimit);
                break;
            }
        }
        System.out.println(bankDetails.toString());

        Deposit d1 = new Deposit();
        String rand = d1.isRandomNumbers(rndLimit); 
        System.out.println("RandomNo: " + rand);
        
        System.out.println("Deposit: " + d1.deposit(accno, amount));
        d1.deposit(name1, IFSC1, amount, rand);

        sc.close(); 
    }
}
