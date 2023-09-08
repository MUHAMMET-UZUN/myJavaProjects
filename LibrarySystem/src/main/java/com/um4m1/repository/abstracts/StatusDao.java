package com.um4m1.repository.abstracts;

import java.sql.SQLException;

public interface StatusDao {
	public String getStatusById(int id) throws SQLException;
}
