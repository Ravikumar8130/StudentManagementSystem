package com.management.system;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.management.system.entity.Student;
import com.management.system.repository.StudentRepository;

@SpringBootApplication
public class Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Autowired

	private StudentRepository studentRepository;
	@Override
	
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	
	}

}
