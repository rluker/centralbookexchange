package com.centralbookexchange.webapp.db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.centralbookexchange.webapp.model.Email;

@Repository
public class EmailRepository
{
	@Autowired
	private JdbcTemplate db;
	  
	public void save(Email email) 
	{
		String sql = "INSERT INTO email (userEmail) values (?)";
		db.update(sql, email.getUserEmail());
	}
}