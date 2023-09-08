package com.um4m1.repository.abstracts;

import java.sql.SQLException;

public interface AuthorDao {
	public String getAuthorById(int id) throws SQLException;
}
