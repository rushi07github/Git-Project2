package com.ecart;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UserLogin {

public static Connection getCommonConnection() throws SQLException {
		
		Connection connection = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			 connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/e_com_application", "root", "Rushi@1168");
			 
			 
		} catch (Exception e) {
		
			e.printStackTrace();
		}
		return connection;
	}

public void getUserDetails() throws SQLException {

		Connection connection = getCommonConnection();
		
		int choose=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("If You are  New User then press 1, if you have account then press 2, For Admin Login press 3");
		choose = scanner.nextInt();
		
		if(choose==1) {
			Scanner sc = new Scanner(System.in);
		
		System.out.println("Register to creat new account");
		
		System.out.println("Enter FirstName :");
		String firstName = sc.nextLine();
		
		System.out.println("Enter lastName :");
		String lastName = sc.nextLine();
		
		System.out.println("Enter userName :");
		String userName = sc.nextLine();
		
		System.out.println("Enter password :");
		String password = sc.nextLine();
		
		System.out.println("Enter city :");
		String city = sc.nextLine();
		
		System.out.println("Enter mailId :");
		String mailId = sc.nextLine();
		
		System.out.println("Enter mobileNo :");
		String mobileNo = sc.nextLine();
		
	   UserRegistration ur = new UserRegistration();
	   ur.setFirstName(firstName);
	   ur.setLastName(lastName);
	   ur.setCity(city);
	   ur.setUserName(userName);
	   ur.setPassword(password);
	   ur.setMailId(mailId);
	   ur.setMobileNo(mobileNo);
		
		PreparedStatement ps = connection.prepareStatement("insert into user_registration (FirstName,LastName,UserName,Password,City,MailId,MobileNo)values(?,?,?,?,?,?,?)");
		
		ps.setString(1,ur.getFirstName());
		ps.setString(2,ur.getLastName());
		ps.setString(3,ur.getUserName());
		ps.setString(4,ur.getPassword());
		ps.setString(5,ur.getCity());
		ps.setString(6,ur.getMailId());
		ps.setString(7,ur.getMobileNo());
		
		ps.execute();
		
		System.out.println("Account created Sucessfully");
		
	
		}else if(choose == 2) {
		Scanner sc = new Scanner(System.in);
			Statement S = connection.createStatement();
			System.out.println("Enter Username");
			String Username = sc.next();
			
			System.out.println("Enter Password");
			String Password = sc.next();
			String s="Select * from user_registration Where UserName='"+Username+"' && Password='"+Password+"'";
			ResultSet rs = S.executeQuery(s);
			if(rs.next()) {
				System.out.println("Login succesfully");
				
				AddProduct ap = new AddProduct();
				ap.selectProduct();
			}else {
				System.out.println("Wrong Information");
			}
			
		
			
		}else if(choose==3) {
				
				
				AdminLogin.Login();
					
			
				
			} else {
				System.out.println("Wrong Information");
			}
	}
	
}


