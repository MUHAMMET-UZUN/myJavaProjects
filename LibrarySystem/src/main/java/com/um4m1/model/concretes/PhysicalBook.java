package com.um4m1.model.concretes;

import com.um4m1.model.abstracts.Entity;

public class PhysicalBook implements Entity
{
	public int ISBN;
	public String bookName;
	public int authorId;
	public String releaseDate;
	public int shelfId;
	public int statusId;
	
	public PhysicalBook(int iSBN, String bookName, int authorId, String releaseDate, int shelfId, int statusId) {
		ISBN = iSBN;
		this.bookName = bookName;
		this.authorId = authorId;
		this.releaseDate = releaseDate;
		this.shelfId = shelfId;
		this.statusId = statusId;
	}

	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getAuthor() {
		return authorId;
	}

	public void setAuthor(int author) {
		this.authorId = author;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public void setShelf(int shelf) {
		this.shelfId = shelf;
	}


	public void setStatus(int status) {
		this.statusId = status;
	}
	
}
