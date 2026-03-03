package com.day7.pack;

public class task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 45;
        int num2 = 70;
        int num3 = 35;

        if (num1 >= num2 && num1 >= num3) {
            System.out.println("Largest number is: " + num1);
        } 
        else if (num2 >= num1 && num2 >= num3) {
            System.out.println("Largest number is: " + num2);
        } 
        else {
            System.out.println("Largest number is: " + num3);
        }
	}

}
