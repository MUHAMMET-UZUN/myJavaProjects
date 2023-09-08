package com.um4m1.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.um4m1.library.DBConstants;

public class AuthorRepo {

	public String getAuthorById(int id) throws SQLException
	{
		Connection c = DBConstants.DBConnection();
		String sql = "select au.\"AUTHOR_NAME\" from \"Author\" au where au.\"AUTHOR_ID\" = ?";
		PreparedStatement stmt = c.prepareStatement(sql);
		stmt.setInt(1, id);
		ResultSet result = stmt.executeQuery();
		
		String author = "";
		while(result.next())
		{
			author = result.getString("AUTHOR_NAME");
		}
		result.close();
		c.close();
		return author;
	}
}
