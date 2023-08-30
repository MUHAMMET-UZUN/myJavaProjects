package com.um4m1.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.um4m1.library.DBConstants;
import com.um4m1.model.PhysicalBook;

public class PhysicalBookRepo {

	public PhysicalBook getBookByISBN(int isbn) throws SQLException
	{
		Connection c = DBConstants.DBConnection();
		String sql = "select * from \"PhysicalBook\" pb where pb.\"ISBN\" = ? ";
		PreparedStatement stmt = c.prepareStatement(sql);
		stmt.setInt(1, isbn);
		ResultSet result = stmt.executeQuery();
		
		PhysicalBook pBook = null;
		while(result.next())
		{
			String bookName = result.getString("BOOK_NAME");
			int author = result.getInt("AUTHOR_ID");
			String releaseDate = result.getString("RELEASE_DATE");
			int shelfType = result.getInt("SHELF_ID");
			int status = result.getInt("STATUS_ID");
			pBook = new PhysicalBook(isbn,bookName,author,releaseDate,shelfType,status);
		}
		result.close();
		c.close();
		return pBook;
	}

	public String getNameByIsbn(int isbn) throws SQLException {
		Connection c = DBConstants.DBConnection();
		String sql = "select pbok.\"BOOK_NAME\" from \"PhysicalBook\" pbok where pbok.\"ISBN\" = ?";
		PreparedStatement stmt = c.prepareStatement(sql);
		stmt.setInt(1, isbn);
		ResultSet result = stmt.executeQuery();
		String bookName ="";
		while(result.next()) 
		{
			bookName = result.getString("BOOK_NAME");
		}
		result.close();
		c.close();
		return bookName;
	}

	public String getReleaseDateByIsbn(int isbn) throws SQLException {
		Connection c = DBConstants.DBConnection();
		String sql = "select pbok.\"RELEASE_DATE\" from \"PhysicalBook\" pbok where pbok.\"ISBN\" = ?";
		PreparedStatement stmt = c.prepareStatement(sql);
		stmt.setInt(1, isbn);
		ResultSet result = stmt.executeQuery();
		
		String releaseDate = "";
		while(result.next())
		{
			releaseDate = result.getString("RELEASE_DATE");
		}
		result.close();
		c.close();
		return releaseDate;
	}
	
}
