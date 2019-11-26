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

@EnableJpaRepositories("com.centralbookexchange.webapp.db")
@EntityScan("com.centralbookexchange.webapp.model")
//public class CBEApplication implements CommandLineRunner {
public class CBEApplication {

    private static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/cbe?user=admin&password=avocadoorchard123";
    @Autowired
    DataSource dataSource;
    @Autowired
    TestRepo testRepo;

    public static void main( String[] args ) throws SQLException {

        try {
            System.out.println( "**************Trying to connect to the database..." );

            Connection conn = DriverManager.getConnection( (DB_URL) );
            PreparedStatement ps = conn.prepareStatement( "SELECT * FROM person" );

            conn.close();

        } catch ( SQLException ex ) {
            ex.printStackTrace();
            System.out.println( ex );
        }

        SpringApplication.run( CBEApplication.class, args );
    }

    //TODO: I'm only using this method with the 'implements CommandLineRunner' version. Commented out for now.
//
//    @Override
//    public void run( String... args ) throws Exception {
//        System.out.println( "Our DataSource is = " + dataSource );
//        Iterable<com.centralbookexchange.webapp.model.TestModel> testModelList = testRepo.findAll();
//        for ( com.centralbookexchange.webapp.model.TestModel testModel : testModelList ) {
//            System.out.println( "Here is a system: " + testModel.toString() );
//        }
//    }

}
