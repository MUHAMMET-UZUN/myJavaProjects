package com.um4m1.model;

import com.um4m1.library.Physical;

public class PhysicalBook implements Physical
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

	@Override
	public int getShelfNumber() {
		return this.shelfId;
	}

	@Override
	public int status() {
		return this.statusId;
	}
	
	
}
