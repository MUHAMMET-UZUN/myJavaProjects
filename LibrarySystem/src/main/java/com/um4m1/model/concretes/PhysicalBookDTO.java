package com.um4m1.model.concretes;

public  class PhysicalBookDTO
{
	private int ISBN;
	private String bookName;
	private String author;
	private String releaseDate;
	private String shelf;
	private String status;
	
	
	public PhysicalBookDTO(int iSBN, String bookName, String author, String releaseDate, String shelf, String status) {
		ISBN = iSBN;
		this.bookName = bookName;
		this.author = author;
		this.releaseDate = releaseDate;
		this.shelf = shelf;
		this.status = status;
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


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public String getReleaseDate() {
		return releaseDate;
	}


	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}


	public String getShelf() {
		return shelf;
	}


	public void setShelf(String shelf) {
		this.shelf = shelf;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return  "\nISBN: " + this.ISBN +
				"\nBook name: " + this.bookName +
				"\nAuthor: " + this.author +
				"\nRelease date: " + this.releaseDate +
				"\nShelf: " + this.shelf +
				"\nStatus: " + this.status;
	}
	
}
