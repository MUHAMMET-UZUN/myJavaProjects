package com.um4m1.model.concretes;

import com.um4m1.model.abstracts.Entity;


public class DigitalBook implements Entity
{
	public long id;
	public int format;
	public int size;
	public String link;
	
	
	public DigitalBook(long id, int format, int size, String link) {
		this.id = id;
		this.format = format;
		this.size = size;
		this.link = link;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public int getFormat() {
		return format;
	}


	public void setFormat(int format) {
		this.format = format;
	}


	public int getSize() {
		return size;
	}


	public void setSize(int size) {
		this.size = size;
	}


	public String getLink() {
		return link;
	}


	public void setLink(String link) {
		this.link = link;
	}


	

}
