package com.um4m1.service;

import java.sql.SQLException;

import com.um4m1.model.PhysicalBook;
import com.um4m1.model.PhysicalBookDTO;
import com.um4m1.repository.AuthorRepo;
import com.um4m1.repository.PhysicalBookRepo;
import com.um4m1.repository.ShelfRepo;
import com.um4m1.repository.StatusRepo;

public class PhysicalBookService {

	PhysicalBookRepo physicalBookRepo = new PhysicalBookRepo();
	AuthorRepo authorRepo = new AuthorRepo();
	ShelfRepo shelfRepo = new ShelfRepo();
	StatusRepo statusRepo = new StatusRepo();
	
	public PhysicalBookDTO getBookByISBN(int isbn)
	{
		PhysicalBookDTO pBookDTO = null;	
		
		try {
		PhysicalBook pBook = physicalBookRepo.getBookByISBN(isbn);
		
		String bookName = physicalBookRepo.getNameByIsbn(isbn);
		String author = authorRepo.getAuthorById(pBook.authorId);
		String releaseDate = physicalBookRepo.getReleaseDateByIsbn(isbn);
		String shelf = shelfRepo.getShelfById(pBook.shelfId);
		String status = statusRepo.getStatusById(pBook.statusId);
		
		pBookDTO = new PhysicalBookDTO(isbn, bookName, author, releaseDate, shelf, status);
		}catch (Exception e) {
			System.out.println(e);
		}
		
		return pBookDTO;
	}
}
