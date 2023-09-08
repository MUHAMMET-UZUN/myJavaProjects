package com.um4m1.library;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConstants 
{
	public static final String USER = "postgres";

	public static final String PASSWORD = "1234";

	public static final String URL = "jdbc:postgresql://localhost:5432/LibrarySystem";

	public static final Connection DBConnection() throws SQLException 
	{
		return DriverManager.getConnection(URL, USER, PASSWORD);
	}
}
