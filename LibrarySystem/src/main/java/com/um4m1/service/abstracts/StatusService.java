package com.um4m1.service.abstracts;

import java.sql.SQLException;

public interface StatusService {
	String getById(int id) throws SQLException;
}
