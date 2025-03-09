package com.project.bookmanagement.entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Component
public class MyBook {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int mybookid;
	private String author;
	private int pages;
	public MyBook(int mybookid, String author, int pages) {
		super();
		this.mybookid = mybookid;
		this.author = author;
		this.pages = pages;
	}
	
	public MyBook() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getMybookid() {
		return mybookid;
	}
	public void setMybookid(int mybookid) {
		this.mybookid = mybookid;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	@Override
	public String toString() {
		return "MyBook [mybookid=" + mybookid + ", author=" + author + ", pages=" + pages + "]";
	}
	
	
}
