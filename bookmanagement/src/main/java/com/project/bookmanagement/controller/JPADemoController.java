package com.project.bookmanagement.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.bookmanagement.entity.MyBook;
import com.project.bookmanagement.repo.jpaRepository;
import com.project.bookmanagement.service.jpaBookManagementService;

@RestController
public class JPADemoController {
	
	@Autowired
	jpaBookManagementService jpaservice;
	
	@RequestMapping(value="/addmyBookDetails",method=RequestMethod.POST)
	public String insertMyBookDetails(@RequestBody MyBook mybookobj) {
		return jpaservice.saveMyBookDetails(mybookobj);
	}
	
	@RequestMapping(value="/updatemyBookDetails",method=RequestMethod.PUT)
	public String updateMyBookDetails(@RequestBody MyBook mybookobj) {
		return jpaservice.updateMyBookDetails(mybookobj);
	}
	
	@RequestMapping(value="/deletemyBookDetails",method=RequestMethod.DELETE)
	public String deleteMyBookDetails(@RequestParam("bookId") Integer bookId) {
		return jpaservice.deleteMyBookDetails(bookId);
	}
	
	@GetMapping("/getAllMyBookDetails")
	public List<MyBook> getAllMyBookDetails(){
		return jpaservice.getAllMyBookDetailService();
	}
	
	@RequestMapping(value="/getBookDetailsByBookId",method=RequestMethod.GET)
	public Optional<MyBook> getBookDetailsByBookId(@RequestParam("bookId") Integer bookId) {
		return jpaservice.getBookDetailsByBookId(bookId);
	}
}
