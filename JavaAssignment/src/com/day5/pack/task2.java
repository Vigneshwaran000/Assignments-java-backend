package com.day5.pack;

public class task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int marks = 85;
	        char grade = 'F';

	        if (marks >= 90) {
	            grade = 'A';
	        } else if (marks >= 75) {
	            grade = 'B';
	        } else if (marks >= 60) {
	            grade = 'C';
	        }

	        System.out.println("Grade: " + grade);

	}

}
