package com.project.bookmanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.bookmanagement.entity.MyBook;
import com.project.bookmanagement.repo.jpaRepository;

@Service
public class jpaBookManagementService {
	
	@Autowired
	private jpaRepository jpaRepo;
	public String saveMyBookDetails(MyBook mybookobj) {
		return jpaRepo.addMyBookDetails(mybookobj);
	}
	public String updateMyBookDetails(MyBook mybookobj) {
		return jpaRepo.updateMyBookDetails(mybookobj);
	}
	
	public String deleteMyBookDetails(int bookId) {
		return jpaRepo.deleteMyBookDetails(bookId);
	}
	
	public List<MyBook> getAllMyBookDetailService(){
		return jpaRepo.getAllMyBookDetails();
	}
	
	public Optional<MyBook> getBookDetailsByBookId( int bookId){
		return jpaRepo.getBookDetailsByBookId(bookId);
	}
}
