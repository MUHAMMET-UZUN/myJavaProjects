package com.um4m1.service;

import java.sql.SQLException;

import com.um4m1.repository.UserRepo;

public class UserService {
	
	UserRepo userRepo = new UserRepo();
	
	public void borrowBookByIsbn(int isbn, int userId) throws SQLException
	{
		userRepo.borrowBookByIsbnTransactional(isbn, userId);
	}
}
