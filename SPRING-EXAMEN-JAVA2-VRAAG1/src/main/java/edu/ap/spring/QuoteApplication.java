package edu.ap.spring;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import edu.ap.spring.view.UI;

@SpringBootApplication
public class QuoteApplication {
	String url = "jdbc:mysql://localhost:3306/quotes";
    String user = "root";
    String password = "root";
	@Autowired
	UI ui;

	@Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return (args) -> {
		};
    }
	
	public static void main(String[] args)  throws IOException {
		
		new SpringApplicationBuilder(QuoteApplication.class).headless(false).run(args);}
		@Bean
		CommandLineRunner runOnStartup() {
			return (args) -> {
				ui.setupUI();
			};
			
			File directory = new File("oscar_wilde.txt");
		    Scanner s = new Scanner(directory);
		    ArrayList<String> list = new ArrayList<String>();
		    while (s.hasNextLine()){
		        list.add(s.nextLine());
		    }
		    s.close();};
		    Connection conn = DriverManager.getConnection(url, user, password);	
	}
}
