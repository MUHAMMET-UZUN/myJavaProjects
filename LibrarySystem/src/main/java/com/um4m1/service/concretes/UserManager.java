package com.um4m1.service.concretes;

import java.sql.SQLException;

import com.um4m1.repository.abstracts.UserDao;
import com.um4m1.repository.concretes.UserRepo;
import com.um4m1.service.abstracts.UserService;

public class UserManager implements UserService{
	
	UserDao userRepo = new UserRepo();
	
	@Override
	public void borrowBookByIsbn(int isbn, int userId) throws SQLException
	{
		userRepo.borrowBookByIsbnTransactional(isbn, userId);
	}
}
