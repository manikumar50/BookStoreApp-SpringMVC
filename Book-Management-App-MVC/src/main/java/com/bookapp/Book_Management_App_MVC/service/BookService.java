package com.bookapp.Book_Management_App_MVC.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookapp.Book_Management_App_MVC.model.BookDetails;
import com.bookapp.Book_Management_App_MVC.repository.BookRepository;

@Service
public class BookService implements BookServiceInterface
{
	@Autowired
	private BookRepository repository;

	@Override
	public List<BookDetails> getAllBooks()
	{
		return repository.findAll();
	}

	@Override
	public BookDetails saveNewBook(BookDetails newBook) 
	{
		return repository.save(newBook);
	}

	@Override
	public BookDetails getNewBook() 
	{	
		return new BookDetails();
	}

	@Override
	public BookDetails getBook(int id) throws Exception
	{
		BookDetails book = repository.findById(id).orElse(null);
		if(book==null)
		{
			throw new Exception("The Deta is Not Available");
		}
		return book;
	}

	@Override
	public void update(int id,BookDetails book) throws Exception 
	{
		BookDetails currentBook=getBook(id);
		
		currentBook.setBookName(book.getBookName());
		currentBook.setAuthorName(book.getAuthorName());
		currentBook.setAvailableStock(book.getAvailableStock());
		currentBook.setPrice(book.getPrice());
		currentBook.setPublishYear(book.getPublishYear());
		saveNewBook(currentBook);
	}

	@Override
	public void delete(int id) throws Exception
	{
		repository.deleteById(id);
	}
		

}
