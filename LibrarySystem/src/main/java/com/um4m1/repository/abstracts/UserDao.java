package com.um4m1.repository.abstracts;

import java.sql.SQLException;

import com.um4m1.model.concretes.User;

public interface UserDao {
	public User getUserById(int id) throws SQLException;
	public void borrowBookByIsbnTransactional(int isbn, int userId) throws SQLException;
}
