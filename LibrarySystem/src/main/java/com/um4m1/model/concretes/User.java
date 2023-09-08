package com.um4m1.model.concretes;

public class User {
	private int userId;
	private int userType;
	private String name;
	private int[] takenBooks;
	
	
	public User(int userId, int userType, String name, int[] takenBooks) {
		super();
		this.userId = userId;
		this.userType = userType;
		this.name = name;
		this.takenBooks = takenBooks;
	}


	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}


	public int getUserType() {
		return userType;
	}


	public void setUserType(int userType) {
		this.userType = userType;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int[] getTakenBooks() {
		return takenBooks;
	}


	public void setTakenBooks(int[] takenBooks) {
		this.takenBooks = takenBooks;
	}


	
}
