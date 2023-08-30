package com.um4m1.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.um4m1.library.DBConstants;

public class StatusRepo {
	public String getStatusById(int id) throws SQLException
	{
		Connection c = DBConstants.DBConnection();
		String sql = "select st.\"STATUS\" from \"Status\" st where st.\"STATUS_ID\" = ?";
		PreparedStatement stmt = c.prepareStatement(sql);
		stmt.setInt(1, id);
		ResultSet result = stmt.executeQuery();
		
		String status = "";		
		while(result.next())
		{
			status = result.getString("STATUS");
		}
		result.close();
		c.close();
		return status;
	}
}
