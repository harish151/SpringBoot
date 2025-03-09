package com.project.bookmanagement.controller;

import java.util.ArrayList;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.project.bookmanagement.service.BookManagementService;

import com.project.bookmanagement.model.*;

@RestController
public class BookMangementController {
	@Autowired
	private BookManagementService bookmanageobj;
	
	@GetMapping("/")
	public String Book() {
		return "The Story Of Enoch Chandrs";
	}
	
	@GetMapping("/listbooks")
	public List<String> getBook() {
		List<String> controllerListofbook = bookmanageobj.getBookList();
		return controllerListofbook;
	}
	
	@RequestMapping(value="/listofbookdetails", method=RequestMethod.GET)
	public List<Book> getListBookDetails() {
		List<Book> listbookdetails = bookmanageobj.getListBookDetails();
		return listbookdetails;
	}
	
	@RequestMapping(value="/titlebookdetails", method=RequestMethod.GET)
	public Book getTitleBookDetails(@RequestParam("title") String titleName){
		Book bookobj = bookmanageobj.getBookDetailsWithTitle(titleName);
		return bookobj;
	} 
	
	@RequestMapping(value="/addBookDetails",method=RequestMethod.POST)
	public String addBookDetails(@RequestBody Book bookobj) {
		String response =  bookmanageobj.addBookDetails(bookobj);
		return response;
	}
	
	@RequestMapping(value="/updateBookDetails",method=RequestMethod.PUT)
	public String updatebookdetails(@RequestBody Book updatedBookObj,@RequestParam("title") String titleName) {
		String updatedResponse = bookmanageobj.updateBookDetails(updatedBookObj,titleName);
		return updatedResponse;
	}
	
	@RequestMapping(value="/deleteBookDetails",method=RequestMethod.DELETE)
	public String deleteBookDetails(@RequestParam("title") String titleName) {
		String response =  bookmanageobj.deleteBookDetails(titleName);
		return response;
	}
}
