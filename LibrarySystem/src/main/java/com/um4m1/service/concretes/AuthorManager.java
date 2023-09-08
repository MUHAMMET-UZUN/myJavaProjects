package com.um4m1.service.concretes;

import java.sql.SQLException;

import com.um4m1.repository.abstracts.AuthorDao;
import com.um4m1.repository.concretes.AuthorRepo;
import com.um4m1.service.abstracts.AuthorService;

public class AuthorManager implements AuthorService{

	@Override
	public String getById(int id) throws SQLException {
		AuthorDao author = new AuthorRepo();
		return author.getAuthorById(id);
	}

}
