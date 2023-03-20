package com.ecart;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddProduct {

	int quantity;
	public Map<String,Integer> list = new HashMap<String,Integer>();
	 int price;
	static String productname;
	static int totals;
	
	public void selectProduct() throws SQLException {
		
		Scanner scanner = new Scanner(System.in);
		int select;
		String repeat;
		
		Product product = new Product();
		product.getProduct();
		
		select = scanner.nextInt();
		System.out.println("=======  Your Product below =======");
		
		if (select == 1) {
			System.out.println("Thanks For selecting Iphone14 SmartPhone");
			System.out.println("Click here for Quantity");
			quantity = scanner.nextInt();
		     price = 59999;
			String pname = "Iphone 14";
			list.put(pname,price);
			totals=quantity*price;
			System.out.println("Your product is added to cart");

			System.out.println("Do You Want To Buy Another Product Then Press Yes if Not Then Press No");
			repeat = scanner.next();
			if (repeat.equalsIgnoreCase("Yes")) {
				selectProduct();
			} else {
				System.out.println("Thanks For Selecting Product");
				System.out.println("now go to cart for buy product ");
				
		}
			Cart add1 = new Cart();
			add1.addToCart(pname, quantity, price,totals, list);
			
	}if (select == 2) {
		System.out.println("Thanks For selecting OnePlus9 SmartPhone");
		System.out.println("Click here for Quantity");
		quantity = scanner.nextInt();
	     price = 29999;
		String pname = "OnePlus9";
		list.put(pname,price);
		totals=quantity*price;
		System.out.println("Your product is added to cart");

		System.out.println("Do You Want To Buy Another Product Then Press Yes if Not Then Press No");
		repeat = scanner.next();
		if (repeat.equalsIgnoreCase("Yes")) {
			selectProduct();
		} else {
			System.out.println("Thanks For Selecting Product");
			System.out.println("now go to cart for buy product ");
		
	}
		Cart add1 = new Cart();
		add1.addToCart(pname, quantity, price,totals, list);
		
	}if (select == 3) {
		System.out.println("Thanks For selecting Realme 9Pro SmartPhone");
		System.out.println("Click here for Quantity");
		quantity = scanner.nextInt();
	     price = 17999;
		String pname = "Realme 9Pro";
		list.put(pname,price);
		totals=quantity*price;
		System.out.println("Your product is added to cart");

		System.out.println("Do You Want To Buy Another Product Then Press Yes if Not Then Press No");
		repeat = scanner.next();
		if (repeat.equalsIgnoreCase("Yes")) {
			selectProduct();
		} else {
			System.out.println("Thanks For Selecting Product");
			System.out.println("now go to cart for buy product ");
		
	}
		Cart add1 = new Cart();
		add1.addToCart(pname, quantity, price,totals, list);
		
	}if (select == 4) {
		System.out.println("Thanks For selecting HP 15s-fq5111TU Laptop");
		System.out.println("Click here for Quantity");
		quantity = scanner.nextInt();
	     price = 58490;
		String pname = "HP 15s-fq5111TU";
		list.put(pname,price);
		totals=quantity*price;
		System.out.println("Your product is added to cart");

		System.out.println("Do You Want To Buy Another Product Then Press Yes if Not Then Press No");
		repeat = scanner.next();
		if (repeat.equalsIgnoreCase("Yes")) {
			selectProduct();
		} else {
			System.out.println("Thanks For Selecting Product");
			System.out.println("now go to cart for buy product ");
		
	}
		Cart add1 = new Cart();
		add1.addToCart(pname, quantity, price,totals, list);
		
	}if (select == 5) {
		System.out.println("Thanks For selecting Asus TUF Gaming A15 Laptop");
		System.out.println("Click here for Quantity");
		quantity = scanner.nextInt();
	     price = 85990;
		String pname = "Asus TUF Gaming A15";
		list.put(pname,price);
		totals=quantity*price;
		System.out.println("Your product is added to cart");

		System.out.println("Do You Want To Buy Another Product Then Press Yes if Not Then Press No");
		repeat = scanner.next();
		if (repeat.equalsIgnoreCase("Yes")) {
			selectProduct();
		} else {
			System.out.println("Thanks For Selecting Product");
			System.out.println("now go to cart for buy product ");
		
	}
		Cart add1 = new Cart();
		add1.addToCart(pname, quantity, price,totals, list);
		
	}if (select == 6) {
		System.out.println("Thanks For selecting Apple MacBook Air 2022 Laptop ");
		System.out.println("Click here for Quantity");
		quantity = scanner.nextInt();
	     price = 108490;
		String pname = "Apple MacBook Air 2022 Laptop";
		list.put(pname,price);
		totals=quantity*price;
		System.out.println("Your product is added to cart");

		System.out.println("Do You Want To Buy Another Product Then Press Yes if Not Then Press No");
		repeat = scanner.next();
		if (repeat.equalsIgnoreCase("Yes")) {
			selectProduct();
		} else {
			System.out.println("Thanks For Selecting Product");
			System.out.println("now go to cart for buy product ");
		
	}
		Cart add1 = new Cart();
		add1.addToCart(pname, quantity, price,totals, list);
		
	}if (select == 7) {
		System.out.println("Thanks For selecting MSI Alpha 15 B5EEK-235IN Laptop ");
		System.out.println("Click here for Quantity");
		quantity = scanner.nextInt();
	     price = 75990;
		String pname = "Apple MacBook Air 2022 Laptop";
		list.put(pname,price);
		totals=quantity*price;
		System.out.println("Your product is added to cart");

		System.out.println("Do You Want To Buy Another Product Then Press Yes if Not Then Press No");
		repeat = scanner.next();
		if (repeat.equalsIgnoreCase("Yes")) {
			selectProduct();
		} else {
			System.out.println("Thanks For Selecting Product");
			System.out.println("now go to cart for buy product ");
		
	}
		Cart add1 = new Cart();
		add1.addToCart(pname, quantity, price,totals, list);
		
	}if (select == 8) {
		System.out.println("Thanks For selectingBoat Airdopes 121 Pro Buds");
		System.out.println("Click here for Quantity");
		quantity = scanner.nextInt();
	     price = 1499;
		String pname = "Boat Airdopes 121 Pro";
		list.put(pname,price);
		totals=quantity*price;
		System.out.println("Your product is added to cart");

		System.out.println("Do You Want To Buy Another Product Then Press Yes if Not Then Press No");
		repeat = scanner.next();
		if (repeat.equalsIgnoreCase("Yes")) {
			selectProduct();
		} else {
			System.out.println("Thanks For Selecting Product");
			System.out.println("now go to cart for buy product ");
		
	}Cart add1 = new Cart();
	add1.addToCart(pname, quantity, price,totals, list);
	
	}if (select == 9) {
		System.out.println("Thanks For selectingBoat Samsung Galaxy Buds2Pro Buds");
		System.out.println("Click here for Quantity");
		quantity = scanner.nextInt();
	     price = 5999;
		String pname = "Samsung Galaxy Buds2Pro";
		list.put(pname,price);
		totals=quantity*price;
		System.out.println("Your product is added to cart");

		System.out.println("Do You Want To Buy Another Product Then Press Yes if Not Then Press No");
		repeat = scanner.next();
		if (repeat.equalsIgnoreCase("Yes")) {
			selectProduct();
		} else {
			System.out.println("Thanks For Selecting Product");
			System.out.println("now go to cart for buy product ");
		
	}
		Cart add1 = new Cart();
		add1.addToCart(pname, quantity, price,totals, list);
		
	}if (select == 10) {
		System.out.println("Thanks For selectingBoat Oppo Ecco X2 Buds");
		System.out.println("Click here for Quantity");
		quantity = scanner.nextInt();
	     price = 3499;
		String pname = "Oppo Ecco X2";
		list.put(pname,price);
		totals=quantity*price;
		System.out.println("Your product is added to cart");

		System.out.println("Do You Want To Buy Another Product Then Press Yes if Not Then Press No");
		repeat = scanner.next();
		if (repeat.equalsIgnoreCase("Yes")) {
			selectProduct();
		} else {
			System.out.println("Thanks For Selecting Product");
			System.out.println("now go to cart for buy product ");
		
	}Cart add1 = new Cart();
	add1.addToCart(pname, quantity, price,totals, list);
	
	}
	System.out.println(list);
	}
}
