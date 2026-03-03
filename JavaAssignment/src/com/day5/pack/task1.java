package com.day5.pack;

public class task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int orderAmount = 6500;
        int discount = 0;

        if (orderAmount > 5000) {
            discount = orderAmount * 10 / 100; // 10% discount
        }

        System.out.println("Discount Amount: ₹" + discount);

	}

}
