package com.bookapp.Book_Management_App_MVC.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookapp.Book_Management_App_MVC.model.BookDetails;

public interface BookRepository extends JpaRepository<BookDetails, Integer>
{
	
}
