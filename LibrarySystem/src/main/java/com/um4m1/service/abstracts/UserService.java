package com.um4m1.service.abstracts;

import java.sql.SQLException;

public interface UserService {
	public void borrowBookByIsbn(int isbn, int userId) throws SQLException;
}
