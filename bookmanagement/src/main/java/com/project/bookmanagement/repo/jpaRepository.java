package com.project.bookmanagement.repo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.bookmanagement.entity.MyBook;

@Repository
public class jpaRepository {
	@Autowired
	private MyRepo myrepo;
	
	public String addMyBookDetails(MyBook mybookobj) {
		MyBook mybook=myrepo.save(mybookobj);
		return "inserted::"+mybook;
	}
	
	public String updateMyBookDetails(MyBook mybookobj) {
		MyBook mybook=myrepo.save(mybookobj);
		return "updated::"+mybook;
	}
	
	public String deleteMyBookDetails(int bookId) {
		myrepo.deleteById(bookId);
		return "deleted successfully";
	}
	
	public Optional<MyBook> getBookDetailsByBookId(int bookId){
		return myrepo.findById(bookId);
	}
}
