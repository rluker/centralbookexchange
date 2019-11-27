package com.centralbookexchange.webapp.model;

import java.io.Serializable;

public class Email implements Serializable
{
	private static final long serialVersionUID = 7371757705250712730L;
	private String userEmail = "";

	public Email()
	{
		setEmail("");
	}
	
	public Email(String userEmail) 
	{
		setEmail(userEmail);
	}

	public Email getEmail() 
	{
		return this;
	}

	public void setEmail(String userEmail) 
	{
		this.userEmail = userEmail;
	}
	
	public String getUserEmail()
	{
		return this.userEmail;
	}
	
	@Override
	public String toString()
	{
		return userEmail;
	}
}
