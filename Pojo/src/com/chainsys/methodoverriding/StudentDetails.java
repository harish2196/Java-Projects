package com.chainsys.methodoverriding;
import java.util.Scanner;

interface Students {
	public  void study();
	public void takeExam();
}

class HighSchoolStudent implements Students {
	String name;
	int age;
	String studentId;

	public void displayInformation() {
		System.out.println("Name: " + name + "\nAge: " + age + "\nStudent ID: " + studentId);
	}

	public HighSchoolStudent(String name, int age, String studentId) {

		this.name = name;
		this.age = age;
		this.studentId = studentId;
	}
	@Override
	public void study() {
		System.out.println(name + " is studying for high school exams.");
	}
	@Override
	public void takeExam() {
		System.out.println(name + " is taking high school exams.");
	}
}
public class StudentDetails {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter name: ");
		String name = scanner.nextLine();
		System.out.println("Enter age: ");
		int age = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter student ID: ");
		String studentId = scanner.nextLine();
		HighSchoolStudent h1=new HighSchoolStudent(name, age, studentId);
		h1.study();
		h1.takeExam();
		System.out.println();
		System.out.println("Student Details");
		h1.displayInformation();
		scanner.close();
	}
}
