package com.ecart;

import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
	
		UserLogin ul = new UserLogin();
		try {
			ul.getUserDetails();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

	}

}
