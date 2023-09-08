package com.um4m1.library;

import java.sql.SQLException;

import com.um4m1.model.concretes.PhysicalBookDTO;
import com.um4m1.service.concretes.PhysicalBookManager;
import com.um4m1.service.abstracts.PhysicalBookService;
import com.um4m1.service.concretes.UserManager;
import com.um4m1.service.abstracts.UserService;

public class MyApp {
	public static void main(String[] args) throws SQLException 
	{
		PhysicalBookService pBookService = new PhysicalBookManager();
		UserService userService = new UserManager();
		
	
	}
}
