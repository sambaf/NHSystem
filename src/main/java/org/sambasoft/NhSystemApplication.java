package org.sambasoft;

import org.sambasoft.entities.User;
import org.sambasoft.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NhSystemApplication  implements  CommandLineRunner{
	   @Autowired
	   private UserService userService;
	     
	public static void main(String[] args) {
		SpringApplication.run(NhSystemApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		  {
    		  User newAdmin = new User("admin@mail.com", "Admin", "123456");
    		  userService.createAdmin(newAdmin); 
    	  }
	}
}
