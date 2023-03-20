package com.ecart;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class AdminLogin {
	
	public static void Login() {
	
		Connection connection = null;
		try {
			UserLogin ul = new UserLogin();
			connection = ul.getCommonConnection();
			Scanner sc = new Scanner(System.in);
			Statement S = connection.createStatement();
			System.out.println("Enter Username");
			String Username = sc.next();
			
			System.out.println("Enter Password");
			String Password = sc.next();
			String s="Select * from admin Where Username='"+Username+"' && Password='"+Password+"'";
			ResultSet rs = S.executeQuery(s);
			if(rs.next()) {
				System.out.println("Login succesfully");
				
				Admin admin = new Admin();
				admin.setProductdetails();
				
			} else {
				System.out.println("Wrong Information");
			}
		} catch (SQLException e) {
	
			e.printStackTrace();
		}
	}

	
}
