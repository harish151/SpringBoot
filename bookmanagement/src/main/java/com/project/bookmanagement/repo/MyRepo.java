package com.project.bookmanagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.bookmanagement.entity.MyBook;

public interface MyRepo extends JpaRepository<MyBook,Integer> {
	
}
