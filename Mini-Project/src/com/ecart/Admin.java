package com.ecart;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Admin {
	
	public void setProductdetails() {
		
		UserLogin ur = new UserLogin();
		Connection connection = null;
		try {
			connection =ur.getCommonConnection();
			
			PreparedStatement ps = connection.prepareStatement("insert into product (categoryid,productid,productname,productdescription,productprice,quantity)values(?,?,?,?,?,?)");
			Scanner sc = new Scanner(System.in);
			System.out.println("Add category");
			System.out.println("Enter 123 for mobile");
			System.out.println("Enter 124 for laptops");
			System.out.println("Enter 125 for Earphones");
			
			System.out.println("Enter categoryid of product");
			int categoryid= sc.nextInt();
			ps.setInt(1, categoryid);
			
			System.out.println("Enter productid of product");
			int productid = sc.nextInt();
			ps.setInt(2, productid);
			
			System.out.println("Enter productname ");
			String productname= sc.next();
			ps.setString(3, productname);
			
			System.out.println("Enter productdescription ");
			String productdescription= sc.next();
			ps.setString(4, productdescription);
			
			System.out.println("Enter productprice ");
			int productprice= sc.nextInt();
			ps.setInt(5, productprice);
			

			System.out.println("Enter quantity ");
			int quantity= sc.nextInt();
			ps.setInt(6, quantity);
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
	
	
}
