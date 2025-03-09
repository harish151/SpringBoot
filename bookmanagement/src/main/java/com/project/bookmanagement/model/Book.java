package com.project.bookmanagement.model;

import org.springframework.stereotype.Component;

@Component
public class Book {
	private String author;
	private int numberofpages;
	private String ISINNumber;
	
	public Book(String author, int numberofpages, String iSINNumber) {
		super();
		this.author = author;
		this.numberofpages = numberofpages;
		ISINNumber = iSINNumber;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getNumberofpages() {
		return numberofpages;
	}
	public void setNumberofpages(int numberofpages) {
		this.numberofpages = numberofpages;
	}
	public String getISINNumber() {
		return ISINNumber;
	}
	public void setISINNumber(String iSINNumber) {
		ISINNumber = iSINNumber;
	}
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	/*@Override
	public String toString() {
		return "Book [author=" + author + ", numberofpages=" + numberofpages + ", ISINNumber=" + ISINNumber + "]";
	}*/
	
	
}
