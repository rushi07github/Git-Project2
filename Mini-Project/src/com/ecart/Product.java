package com.ecart;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Product {
	
	public void getProduct() throws SQLException {
		
		UserLogin ul = new UserLogin();
		Connection connection= null;
		
		try {
			 connection =ul.getCommonConnection();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		PreparedStatement ps = null;
		ResultSet rs = null;
		
			
			int a = 0;
			System.out.println("Select category");
			System.out.println("Select 123 for mobile");
			System.out.println("Select 124 for laptops");
			System.out.println("Select 125 for Earphones");
			
			System.out.println("Enter the category");
			Scanner scanner = new Scanner(System.in);
			a = scanner.nextInt();
			AddProduct  ap = new AddProduct ();
			if (a == 123) {
				ps = connection.prepareStatement("select * from product where categoryid='123'");
				rs = ps.executeQuery();
				while (rs.next()) {
					System.out.println("===============================================================================");
					System.out.println("ProductId >> "+rs.getInt("productid"));
					System.out.println("productname >>"+rs.getString("productname"));
					System.out.println("productdescription >>"+rs.getString("productdescription"));
					System.out.println("productprice >>"+rs.getString("productprice"));
					System.out.println("quantity >>"+rs.getString("quantity"));
					System.out.println("===============================================================================");
				
				}
				System.out.println("select 1 for IPhone14,Select 2 for OnePlus9,Select 3 Realme 9Pro");
				
			} else if (a == 124) {
				ps = connection.prepareStatement("select * from product where categoryid='124'");
				rs = ps.executeQuery();
				while (rs.next()) {
					System.out.println("===============================================================================");
					System.out.println("ProductId >>"+rs.getInt("productid"));
					System.out.println("productname >>"+rs.getString("productname"));
					System.out.println("productdescription >>"+rs.getString("productdescription"));
					System.out.println("productprice >>"+rs.getString("productprice"));
					System.out.println("quantity >>"+rs.getString("quantity"));
					System.out.println("===============================================================================");
					
					
				}
				System.out.println("select 4 for HP 15s-fq5111TU,Select 5 for Asus TUF Gaming A15, Select 6 for Apple MacBook Air 2022 Laptop, Select 7 for MSI Alpha 15 B5EEK-235IN Laptop");
	        }else if (a == 125) {
				ps = connection.prepareStatement("select * from product where categoryid='125'");
				rs = ps.executeQuery();
				while (rs.next()) {
					System.out.println("===============================================================================");
					System.out.println("ProductId >>"+rs.getInt("productid"));
					System.out.println("productname >>"+rs.getString("productname"));
					System.out.println("productdescription >>"+rs.getString("productdescription"));
					System.out.println("productprice >>"+rs.getString("productprice"));
					System.out.println("quantity >>"+rs.getString("quantity"));
					System.out.println("===============================================================================");
					
					
				}
				System.out.println("select 8 for Boat Airdopes 121 Pro,Select 9 for Samsung Galaxy Buds2Pro, Select 10 for Oppo Ecco X2 ");
	         } else {
					System.out.println("out off stock");
				}
	
	}		
}
