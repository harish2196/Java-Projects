package com.chainsys.day4;

import java.util.Scanner;

public class displayHighScorePosition1 {

	
	public static void displayHighScorePosition(String playerName, int scorePosition) {
		System.out.println(playerName + " managed to get into position " + scorePosition);
	}

	public static int calculateHighScorePosition(int playerScore) {
		if(playerScore >= 1000) {
			return 1;
		} else if(playerScore >= 500 && playerScore<1000) {
			return 2;
		} else if(playerScore >= 100 && playerScore<500) {
			return 3;
		} else {
			return 4;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Score1: ");
		int score1 = sc.nextInt();
		while(score1<0) {
			System.out.println("Please Re-enter Positive Number: ");
			System.out.println("Enter the Score1: ");
			score1 = sc.nextInt();
		}
		
		
		System.out.println("Enter the Score2: ");
		int score2 = sc.nextInt();
		while(score2<0) {
			System.out.println("Please Re-enter Positive Number: ");
			System.out.println("Enter the Score2: ");
			score2 = sc.nextInt();
		}
		System.out.println("Enter the Score3: ");
		int score3 = sc.nextInt();
		while(score3<0) {
			System.out.println("Please Re-enter Positive Number: ");
			System.out.println("Enter the Score1: ");
			score3 = sc.nextInt();
		}
		System.out.println("Enter the Score4: ");
		int score4 = sc.nextInt();
		while(score4<0) {
			System.out.println("Please Re-enter Positive Number: ");
			System.out.println("Enter the Score1: ");
			score4 = sc.nextInt();
		}
		int felixScore = calculateHighScorePosition(score1);
		displayHighScorePosition("Tom", felixScore);
		int argelScore = calculateHighScorePosition(score2);
		displayHighScorePosition("Angel", argelScore);
		int anduchoScore = calculateHighScorePosition(score3);
		displayHighScorePosition("Remo", anduchoScore);		
		int puentesScore = calculateHighScorePosition(score4);
		displayHighScorePosition("Haris", puentesScore);
		sc.close();
	}

}