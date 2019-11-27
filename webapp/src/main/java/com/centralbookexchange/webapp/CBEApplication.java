package com.centralbookexchange.webapp;

import com.centralbookexchange.webapp.db.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;


@SpringBootApplication
public class CBEApplication 
{
    public static void main( String[] args ) throws SQLException 
    {
        SpringApplication.run( CBEApplication.class, args );
    }

}
