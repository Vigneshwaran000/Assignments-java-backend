package com.day5.pack;
import java.util.Scanner;

public class task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        String user = "vignesh";
	        String pass = "123";

	        System.out.print("Enter username: ");
	        String u = sc.nextLine();

	        System.out.print("Enter password: ");
	        String p = sc.nextLine();

	        if (u.equals(user) && p.equals(pass)) {
	            System.out.println("Login Successful");
	        } else {
	            System.out.println("Login Unsuccessful");
	        }
	        
	}

}
