package com.bookapp.Book_Management_App_MVC.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bookapp.Book_Management_App_MVC.model.BookDetails;
import com.bookapp.Book_Management_App_MVC.service.BookServiceInterface;

@Controller
public class BookController 
{
	@Autowired
	private BookServiceInterface service;
	
	@GetMapping("/")
	public String homePage()
	{
		return "index";
	}
	
	@GetMapping("/getAllBooks")
	public ModelAndView showTable()
	{
		return new ModelAndView("Available_Books","Books",service.getAllBooks());
	}
	
	@GetMapping("/add")
	public ModelAndView addNewBook()
	{
		return new ModelAndView("add_new_book","Book",service.getNewBook());
	}
	
	@PostMapping("/new")
	public String newBook(@ModelAttribute("Book") BookDetails book) 
	{
		service.saveNewBook(book);
		return "redirect:/getAllBooks";
	}
	
	@GetMapping("/edit-details/{id}")
	public ModelAndView editDetails(@PathVariable("id") int id) throws Exception
	{
		return new ModelAndView("update_page","Book",service.getBook(id));
	}
	
	@PostMapping("/update/{id}")
	public String updateDetails(@PathVariable("id") int id, @ModelAttribute("Book") BookDetails book) throws Exception 
	{
		service.update(id,book);
		return "redirect:/getAllBooks";
	}
	
	@GetMapping("/drop-details/{id}")
	public ModelAndView dropDetails(@PathVariable("id") int id)throws Exception
	{
		return new ModelAndView("drop_page","Book",service.getBook(id));
	}
	
	@PostMapping("/delete/{id}")
	public String deleteDetails(@PathVariable("id") int id) throws Exception
	{
		service.delete(id);
		return "redirect:/getAllBooks";
	}
}
