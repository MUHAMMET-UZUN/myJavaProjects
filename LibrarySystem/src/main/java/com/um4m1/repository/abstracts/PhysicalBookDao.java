package com.um4m1.repository.abstracts;

import java.sql.SQLException;

import com.um4m1.model.concretes.PhysicalBook;

public interface PhysicalBookDao {
	public PhysicalBook getBookByISBN(int isbn) throws SQLException;
	public String getNameByIsbn(int isbn) throws SQLException;
	public String getReleaseDateByIsbn(int isbn) throws SQLException;
}
