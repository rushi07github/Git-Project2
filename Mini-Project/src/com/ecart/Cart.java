package com.ecart;

import java.util.Map;
import java.util.Scanner;

public class Cart {

	static Scanner scanner = new Scanner(System.in);
	
	public static void addToCart(String pname, int quantity, int price, int totals, Map<String, Integer> list) {
		int totalPrice = 0;
		totalPrice = totals;
		System.out.println("Selected product name and price "+list);
		System.out.println(quantity);
		
		System.out.println("for removing product press 1 or press 2 for continue");
		
		int c=scanner.nextInt();
		
           if(c==1) {
			System.out.println("select 1 for IPhone14,Select 2 for OnePlus9 ,Select 3 Realme 9Pro");
			System.out.println("select 4 for HP 15s-fq5111TU,Select 5 for Asus TUF Gaming A15, Select 6 for Apple MacBook Air 2022 Laptop , Select 7 for MSI Alpha 15 B5EEK-235IN Laptop");
			System.out.println("select 8 for Boat Airdopes 121 Pro , Select 9 for Samsung Galaxy Buds2Pro, Select 10 for Oppo Ecco X2");
			
			int select=scanner.nextInt();
			if(select==1) {
			System.out.println("Enter the name of product that you want to remove");
			pname=scanner.next();
			System.out.println("Enter the quantity");
			quantity=scanner.nextInt();
			System.out.println("Enter the price");
			price=scanner.nextInt();
			int temp=quantity;
			totals=totals-(quantity*price);
			
		     quantity=temp-quantity;
			addToCart(pname, quantity, price,totals, list);
			}
			else if(select==2){
				System.out.println("Enter the name of product that you want to remove");
				pname=scanner.next();
				System.out.println("Enter the quantity");
				quantity=scanner.nextInt();
				System.out.println("Enter the price");
				price=scanner.nextInt();
				int temp=quantity;
				totals=totals-(quantity*price);
				
			     quantity=temp-quantity;
			     addToCart(pname, quantity, price,totals, list);
				
			}else if(select==3) {
				System.out.println("Enter the name of product that you want to remove");
				pname=scanner.next();
				System.out.println("Enter the quantity");
				quantity=scanner.nextInt();
				System.out.println("Enter the price");
				price=scanner.nextInt();
				int temp=quantity;
				totals=totals-(quantity*price);
				
			     quantity=temp-quantity;
			     addToCart(pname, quantity, price,totals, list);
			}else if(select==4) {
				System.out.println("Enter the name of product that you want to remove");
				pname=scanner.next();
				System.out.println("Enter the quantity");
				quantity=scanner.nextInt();
				System.out.println("Enter the price");
				price=scanner.nextInt();
				int temp=quantity;
				totals=totals-(quantity*price);
				
			     quantity=temp-quantity;
			     addToCart(pname, quantity, price,totals, list);
			}else if(select==5) {
				System.out.println("Enter the name of product that you want to remove");
				pname=scanner.next();
				System.out.println("Enter the quantity");
				quantity=scanner.nextInt();
				System.out.println("Enter the price");
				price=scanner.nextInt();
				int temp=quantity;
				totals=totals-(quantity*price);
				
			     quantity=temp-quantity;
			     addToCart(pname, quantity, price,totals, list);
			}else if(select==6) {
				System.out.println("Enter the name of product that you want to remove");
				pname=scanner.next();
				System.out.println("Enter the quantity");
				quantity=scanner.nextInt();
				System.out.println("Enter the price");
				price=scanner.nextInt();
				int temp=quantity;
				totals=totals-(quantity*price);
				
			     quantity=temp-quantity;
			     addToCart(pname, quantity, price,totals, list);
			}else if(select==7) {
				System.out.println("Enter the name of product that you want to remove");
				pname=scanner.next();
				System.out.println("Enter the quantity");
				quantity=scanner.nextInt();
				System.out.println("Enter the price");
				price=scanner.nextInt();
				int temp=quantity;
				totals=totals-(quantity*price);
				
			     quantity=temp-quantity;
			     addToCart(pname, quantity, price,totals, list);
			}else if(select==8) {
				System.out.println("Enter the name of product that you want to remove");
				pname=scanner.next();
				System.out.println("Enter the quantity");
				quantity=scanner.nextInt();
				System.out.println("Enter the price");
				price=scanner.nextInt();
				int temp=quantity;
				totals=totals-(quantity*price);
				
			     quantity=temp-quantity;
			     addToCart(pname, quantity, price,totals, list);
			}else if(select==9) {
				System.out.println("Enter the name of product that you want to remove");
				pname=scanner.next();
				System.out.println("Enter the quantity");
				quantity=scanner.nextInt();
				System.out.println("Enter the price");
				price=scanner.nextInt();
				int temp=quantity;
				totals=totals-(quantity*price);
				
			     quantity=temp-quantity;
			     addToCart(pname, quantity, price,totals, list);
			}else if(select==10) {
				System.out.println("Enter the name of product that you want to remove");
				pname=scanner.next();
				System.out.println("Enter the quantity");
				quantity=scanner.nextInt();
				System.out.println("Enter the price");
				price=scanner.nextInt();
				int temp=quantity;
				totals=totals-(quantity*price);
				
			     quantity=temp-quantity;
			     addToCart(pname, quantity, price,totals, list);
			}
		}else {
			System.out.println("Thanks for buying >>"+list);
		
			System.out.println("Your total bill is "+totalPrice+"rs only");
		}
		
	}
	
}
