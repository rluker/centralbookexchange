package com.centralbookexchange.webapp.model;

import java.io.Serializable;

public class Book implements Serializable 
{
	private static final long serialVersionUID = -150243841752099280L;
	private String title;
	private String author;
	private String isbn;
	private String bookImage;
	
	public Book(String title, String author, String bookImage)
	{
		this.setTitle(title);
		this.setAuthor(author);
		this.setBookImage(bookImage);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getBookImage() {
		return bookImage;
	}

	public void setBookImage(String bookImage) {
		this.bookImage = bookImage;
	}
}
