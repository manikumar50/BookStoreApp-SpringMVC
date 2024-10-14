package com.bookapp.Book_Management_App_MVC.service;

import java.util.List;

import com.bookapp.Book_Management_App_MVC.model.BookDetails;

public interface BookServiceInterface 
{
	public List<BookDetails> getAllBooks();
	public BookDetails saveNewBook(BookDetails newBook);
	public BookDetails getNewBook();
	public BookDetails getBook(int id) throws Exception;
	
	public void update(int id, BookDetails book) throws Exception;
	public void delete(int id) throws Exception;
}
