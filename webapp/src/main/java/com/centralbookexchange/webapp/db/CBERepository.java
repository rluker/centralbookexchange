package com.centralbookexchange.webapp.db;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.centralbookexchange.webapp.model.Email;
import com.centralbookexchange.webapp.model.Event;

@Repository
public class CBERepository
{
	@Autowired
	private JdbcTemplate db;
	  
	public void saveEmail(Email email) 
	{
		String sql = "INSERT INTO email (userEmail) values (?)";
		db.update(sql, email.getUserEmail());
	}
    
    public List<Event> getAllEvents() 
    {

        String sql = "SELECT * FROM events";

        return db.query( sql, (rs, rowNum) -> 
        	new Event
        	(
        		rs.getString("name"),
                rs.getString("description"),
                rs.getString("imagePath")
        	)
        );
    }
	
    
}