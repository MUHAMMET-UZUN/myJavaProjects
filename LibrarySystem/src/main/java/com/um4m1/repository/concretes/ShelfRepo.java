package com.um4m1.repository.concretes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.um4m1.library.DBConstants;
import com.um4m1.repository.abstracts.ShelfDao;

public class ShelfRepo implements ShelfDao{
	
	@Override
	public String getShelfById(int id) throws SQLException
	{
		Connection c = DBConstants.DBConnection();
		String sql = "select \"Shelf\".\"SHELF_TYPE\" from \"Shelf\" where \"Shelf\".\"SHELF_ID\" = ?";
		PreparedStatement stmt = c.prepareStatement(sql);
		stmt.setInt(1, id);
	
		String shelf = "";
		ResultSet result = stmt.executeQuery();
		while(result.next())
		{
			shelf = result.getString("SHELF_TYPE");			
		}
		result.close();
		c.close();
		return shelf;
	}
}
