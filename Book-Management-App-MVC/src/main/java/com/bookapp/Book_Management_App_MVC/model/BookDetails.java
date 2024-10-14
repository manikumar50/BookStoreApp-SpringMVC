package com.bookapp.Book_Management_App_MVC.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="book_details")
public class BookDetails
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(insertable = false)
	private int id;
	@Column(length = 20,nullable = false)
	private String bookName;
	@Column(length = 20,nullable = false)
	private String authorName;
	@Column(length = 20,nullable = false)
	private int publishYear;
	@Column(length = 20,nullable = false)
	private int availableStock;
	@Column(length = 20,nullable = false)
	private int price;
	
	public int getId() 
	{
		return id;
	}
	
	public void setId(int id) 
	{
		this.id = id;
	}
	
	public String getBookName() {
		return bookName;
	}
	
	public void setBookName(String bookName)
	{
		this.bookName = bookName;
	}
	
	public String getAuthorName() {
		return authorName;
	}
	
	public void setAuthorName(String authorName) 
	{
		this.authorName = authorName;
	}
	
	public int getPublishYear()
	{
		return publishYear;
	}
	
	public void setPublishYear(int publishYear) 
	{
		this.publishYear = publishYear;
	}
	
	public int getAvailableStock() {
		return availableStock;
	}
	
	public void setAvailableStock(int availableStock)
	{
		this.availableStock = availableStock;
	}
	
	public int getPrice() 
	{
		return price;
	}
	
	public void setPrice(int price) 
	{
		this.price = price;
	}
	
	public BookDetails(int id, String bookName, String authorName, int publishYear, int availableStock, int price) 
	{
		this.id = id;
		this.bookName = bookName;
		this.authorName = authorName;
		this.publishYear = publishYear;
		this.availableStock = availableStock;
		this.price = price;
	}
	
	public BookDetails()
	{
		
	}
	
	
}
