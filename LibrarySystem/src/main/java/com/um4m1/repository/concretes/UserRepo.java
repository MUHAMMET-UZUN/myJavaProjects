package com.um4m1.repository.concretes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.um4m1.library.DBConstants;
import com.um4m1.model.concretes.User;
import com.um4m1.repository.abstracts.UserDao;

public class UserRepo implements UserDao{
	
	@Override
	public User getUserById(int id) throws SQLException
	{
		Connection c = DBConstants.DBConnection();
		String sql = "UPDATE public.\"PhysicalBook\" pb SET \"STATUS_ID\"=? WHERE pb.\"ISBN\" = ?";
		PreparedStatement stmt = c.prepareStatement(sql);
		stmt.setInt(1, 1);
		ResultSet result = stmt.executeQuery();
	
		User user = null;
		while(result.next())
		{
			int userId = result.getInt("USER_ID");
			int userType = result.getInt("USER_TYPE");
			String name = result.getString("USER_NAME");
			int[] takenBooks = (int[]) result.getArray("TAKEN_BOOKS").getArray();
			user = new User(userId, userType, name, takenBooks);
		}
		return user;
	}
	
	@Override
	public void borrowBookByIsbnTransactional(int isbn, int userId) throws SQLException
	{
		Connection c = DBConstants.DBConnection();
		c.setAutoCommit(false);
		try {
		String sql = "UPDATE public.\"PhysicalBook\" pb SET \"STATUS_ID\"=? WHERE pb.\"ISBN\" = ?";
		PreparedStatement stmt = c.prepareStatement(sql);
		stmt.setInt(1, 1);
		stmt.setInt(2, isbn);
		stmt.executeUpdate();
		stmt.close();
		
		sql = "UPDATE public.\"User\" SET \"TAKEN_BOOKS\"= \"TAKEN_BOOKS\" || ARRAY[?] WHERE \"User\".\"USER_ID\" = ?";
		stmt = c.prepareStatement(sql);
		stmt.setInt(1, isbn);
		stmt.setInt(2, userId);
		stmt.executeUpdate();
		stmt.close();
		c.commit();
		c.close();
		
		}catch (Exception e) {
			System.out.println(e);
			c.rollback();
		}
	}
}
