package com.centralbookexchange.webapp.db;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.centralbookexchange.webapp.model.Banner;
import com.centralbookexchange.webapp.model.Book;
import com.centralbookexchange.webapp.model.Email;
import com.centralbookexchange.webapp.model.Event;
import com.centralbookexchange.webapp.model.StaffPick;

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
	
    public List<Banner> getAllBanners() 
    {
        String sql = "SELECT * FROM current_events";

        return db.query( sql, (rs, rowNum) -> 
        	new Banner
        	(
        		rs.getInt("eventId"),
                getEventById(rs.getInt("eventId")),
                rs.getString("eventTimes")
        	)
        );
    }
    
    public List<StaffPick> getAllPicks() 
    {
        String sql = "SELECT * FROM staffpicks";

        return db.query( sql, (rs, rowNum) -> 
        	new StaffPick
        	(
        		rs.getString("pickText"),
                getBookById(rs.getInt("pickId"))
        	)
        );
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
    
    public Event getEventById(int id) 
    {
        String sql = "SELECT * FROM events WHERE id = " + id;

        return ( db.query( sql, (rs, rowNum) -> 
        	new Event
        	(
        		rs.getString("name"),
                rs.getString("description"),
                rs.getString("imagePath")
        	)
        ) ).get(0);
    }
	
    public Book getBookById(int id) 
    {
        String sql = "SELECT * FROM books WHERE id = " + id;

        return ( db.query( sql, (rs, rowNum) -> 
        	new Book
        	(
        		rs.getString("title"),
                rs.getString("author"),
                rs.getString("image")
        	)
        ) ).get(0);
    }
    
}