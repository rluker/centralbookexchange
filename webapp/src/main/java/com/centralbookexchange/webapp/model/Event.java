package com.centralbookexchange.webapp.model;

import java.io.Serializable;

public class Event implements Serializable
{
	private static final long serialVersionUID = 4392246414252340391L;
	
	private String name = "";
	private String description = "";
	private String imagePath = "";

	public Event(String name, String description, String imagePath) 
	{
		this.setName(name);
		this.setDescription(description);
		this.setImagePath(imagePath);
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public String getDescription() 
	{
		return description;
	}

	public void setDescription(String description) 
	{
		this.description = description;
	}

	public String getImagePath() 
	{
		return imagePath;
	}

	public void setImagePath(String imagePath) 
	{
		this.imagePath = imagePath;
	}


}
