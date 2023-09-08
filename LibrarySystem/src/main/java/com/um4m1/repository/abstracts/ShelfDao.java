package com.um4m1.repository.abstracts;

import java.sql.SQLException;

public interface ShelfDao {
	public String getShelfById(int id) throws SQLException;
}
