package com.centralbookexchange.webapp;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.sql.SQLException;


@SpringBootApplication
public class CBEApplication 
{
    public static void main( String[] args ) throws SQLException 
    {
        SpringApplication.run( CBEApplication.class, args );
    }

}
