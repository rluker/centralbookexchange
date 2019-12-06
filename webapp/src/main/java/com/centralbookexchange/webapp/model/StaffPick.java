package com.centralbookexchange.webapp.model;

import java.io.Serializable;

public class StaffPick implements Serializable 
{
	private static final long serialVersionUID = -2340755142797614026L;
	
	private String pickText;
	private Book baseBook;

	public StaffPick(String pickText, Book baseBook)
	{
		this.setPickText(pickText);
		this.setBaseBook(baseBook);
	}

	public String getPickText() {
		return pickText;
	}

	public void setPickText(String pickText) {
		this.pickText = pickText;
	}

	public Book getBaseBook() {
		return baseBook;
	}

	public void setBaseBook(Book baseBook) {
		this.baseBook = baseBook;
	}
}
