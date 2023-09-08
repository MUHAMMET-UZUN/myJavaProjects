package com.um4m1.service.abstracts;

import com.um4m1.model.concretes.PhysicalBookDTO;

public interface PhysicalBookService {
	public PhysicalBookDTO getBookByISBN(int isbn);
}
