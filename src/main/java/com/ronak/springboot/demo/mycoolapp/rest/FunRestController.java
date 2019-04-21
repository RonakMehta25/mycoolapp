package com.ronak.springboot.demo.mycoolapp.rest;

/*import java.sql.Connection;
import java.sql.DriverManager;*/
import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

	
	@GetMapping("/")
	public String sayHello()
	{
		/*System.out.println("Connecting to Database");
		 
		String jdbcURL="jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false";
		String user="hbstudent";
		String pass="hbstudent";
		try {
			Connection myCon= DriverManager.getConnection(jdbcURL,user,pass);
			System.out.println("Connection Successful");
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}*/
		return("Hello world ..Hello Good Day . Time is " + LocalDateTime.now());
		
	}
	
}
