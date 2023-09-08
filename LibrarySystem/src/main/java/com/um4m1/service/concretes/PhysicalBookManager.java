package com.um4m1.service.concretes;

import com.um4m1.model.concretes.PhysicalBook;
import com.um4m1.model.concretes.PhysicalBookDTO;
import com.um4m1.repository.abstracts.AuthorDao;
import com.um4m1.repository.abstracts.PhysicalBookDao;
import com.um4m1.repository.abstracts.ShelfDao;
import com.um4m1.repository.abstracts.StatusDao;
import com.um4m1.repository.concretes.AuthorRepo;
import com.um4m1.repository.concretes.PhysicalBookRepo;
import com.um4m1.repository.concretes.ShelfRepo;
import com.um4m1.repository.concretes.StatusRepo;
import com.um4m1.service.abstracts.PhysicalBookService;

public class PhysicalBookManager implements PhysicalBookService{

	
	@Override
	public PhysicalBookDTO getBookByISBN(int isbn)
	{
		PhysicalBookDao physicalBookDao = new PhysicalBookRepo();
		AuthorDao authorDao = new AuthorRepo();
		ShelfDao shelfDao = new ShelfRepo();
		StatusDao statusDao = new StatusRepo();
		
		PhysicalBookDTO book = null;	
		
		try {
		PhysicalBook pBook = physicalBookDao.getBookByISBN(isbn);
		
		String bookName = physicalBookDao.getNameByIsbn(isbn);
		String author = authorDao.getAuthorById(pBook.authorId);
		String releaseDate = physicalBookDao.getReleaseDateByIsbn(isbn);
		String shelf = shelfDao.getShelfById(pBook.shelfId);
		String status = statusDao.getStatusById(pBook.statusId);
		
		book = new PhysicalBookDTO(isbn, bookName, author, releaseDate, shelf, status);
		}catch (Exception e) {
			System.out.println(e);
		}
		
		return book;
	}
}
