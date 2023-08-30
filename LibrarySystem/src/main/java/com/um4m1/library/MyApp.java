package com.um4m1.library;

import java.sql.SQLException;

import com.um4m1.model.PhysicalBookDTO;
import com.um4m1.service.PhysicalBookService;
import com.um4m1.service.UserService;

public class MyApp {
	public static void main(String[] args) throws SQLException 
	{
		PhysicalBookService pBookService = new PhysicalBookService();
		UserService userService = new UserService();
		
		PhysicalBookDTO pbookDto = null;
		pbookDto = pBookService.getBookByISBN(0);
		
		
		System.out.println(pbookDto);
		userService.borrowBookByIsbn(0, 0);
		pbookDto = pBookService.getBookByISBN(0);
		System.out.println(pbookDto);
	}
}
