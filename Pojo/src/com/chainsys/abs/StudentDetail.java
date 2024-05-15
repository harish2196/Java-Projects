package com.chainsys.abs;

import java.util.Scanner;

abstract class Student {
	String name;
	int age;

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public abstract void getDetails();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public abstract void displayDetails();
}

class HighSchoolStudent extends Student {
	int gradeLevel;

	public HighSchoolStudent(String name, int age, int gradeLevel) {
		super(name, age);
		this.gradeLevel = gradeLevel;
	}

	@Override
	public void getDetails() {
		System.out.println("High School Student:");
		System.out.println("Name: " + getName());
		System.out.println("Age: " + getAge());
		System.out.println("Grade Level: " + gradeLevel);
	}

	@Override
	public void displayDetails() {
	System.out.println("Name: "+ name + "Age: "+ age );
		
	}
}

class CollegeStudent extends Student {
	String major;

	public CollegeStudent(String name, int age, String major) {
		super(name, age);
		this.major = major;
	}
	@Override
	public void getDetails() {
		System.out.println("College Student:");
		System.out.println("Name: " + getName());
		System.out.println("Age: " + getAge());
		System.out.println("Major: " + major);
	}
	@Override
	public void displayDetails() {
		System.out.println("Name: "+ name + "\nAge: "+ age );	
	}
}


public class StudentDetail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name of High School Student:");
        String highSchoolName = scanner.nextLine();
        System.out.println("Enter age of High School Student:");
        int highSchoolAge = scanner.nextInt();
        System.out.println("Enter grade level of High School Student:");
        int highSchoolGradeLevel = scanner.nextInt();

        Student highSchoolStudent = new HighSchoolStudent(highSchoolName, highSchoolAge, highSchoolGradeLevel);
        scanner.nextLine();
        System.out.println("\nEnter name of College Student:");
        String collegeName = scanner.nextLine();
        System.out.println("Enter age of College Student:");
        int collegeAge = scanner.nextInt();
        scanner.nextLine(); 
        System.out.println("Enter major of College Student:");
        String collegeMajor = scanner.nextLine();

        Student collegeStudent = new CollegeStudent(collegeName, collegeAge, collegeMajor);
        System.out.println("\nHigh School Student Details:");
        highSchoolStudent.getDetails();
        System.out.println("\nCollege Student Details:");
        collegeStudent.getDetails();

        scanner.close();
    }
}

