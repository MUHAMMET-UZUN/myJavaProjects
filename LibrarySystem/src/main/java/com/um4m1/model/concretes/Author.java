package com.um4m1.model.concretes;

import com.um4m1.model.abstracts.Entity;

public class Author implements Entity{
	
	private int authorId;
	private String authorName;
	
	public Author() {}
	
	public Author(int authorId, String authorName) {
		super();
		this.authorId = authorId;
		this.authorName = authorName;
	}
	
	public int getAuthorId() {
		return authorId;
	}
	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	
	
}
