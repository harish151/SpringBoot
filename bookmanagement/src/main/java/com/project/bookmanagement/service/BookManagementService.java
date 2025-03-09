package com.project.bookmanagement.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import com.project.bookmanagement.model.Book;

@Service
public class BookManagementService {
	Map<String,Book> mapbook = new HashMap<>();
	int titlekey=4;
	
	public List<String> getBookList() {
			List<String> l = new ArrayList<>();
			l.add("c");
			l.add("python");
			l.add("c++");
			l.add("java");
			return l;	
	}
	
	public List<Book> getListBookDetails(){
		List<Book> listofBookDetails = new ArrayList<Book>();
		listofBookDetails.add(new Book("xyz",10,"ISIN001"));
		listofBookDetails.add(new Book("abc",1000,"ISIN002"));
		listofBookDetails.add(new Book("pqr",20,"ISIN003"));
		listofBookDetails.add(new Book("def",100,"ISIN004"));
		listofBookDetails.add(new Book("ABC",50,"ISIN005"));
		return listofBookDetails;	
	}
	
	public Book getBookDetailsWithTitle( String titleName) {
		Map<String,Book> mapbook = new HashMap<>();
		mapbook.put("title1",new Book("xyz",10,"ISIN001"));
		mapbook.put("title2",new Book("abc",1000,"ISIN002"));
		mapbook.put("title3",new Book("pqr",20,"ISIN003"));
		return mapbook.get(titleName);
	}

	public String addBookDetails(Book bookobj) {
		mapbook.put("title"+titlekey,bookobj);
		titlekey=titlekey+1;
		return "success";
	}

	public String updateBookDetails(Book updatedBookObj,String booktitle) {
		mapbook.put(booktitle,updatedBookObj);
		return "updated successfully";
	}

	public String deleteBookDetails(String booktitle) {
		mapbook.remove(booktitle);
		return "deleted successful";
	}
	
	


}
