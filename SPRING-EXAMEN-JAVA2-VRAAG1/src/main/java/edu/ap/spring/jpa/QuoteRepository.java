package edu.ap.spring.jpa;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuoteRepository extends CrudRepository<Quote, Long>  {

    static final String insertSql ="Insert into quote (thequote) values (?)";
    
    
    public static void addQuotes(List<String> input, Connection conn) throws SQLException {
    	PreparedStatement statement = conn.prepareStatement(insertSql);
    	
        statement.setString(1, input.get(0));
    }
    
}


