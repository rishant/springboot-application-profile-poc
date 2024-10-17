package com.example.spring_profile_poc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.spring_profile_poc.config.SmppConfig;

@SpringBootApplication
public class SpringProfilePocApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringProfilePocApplication.class, args);
	}

	@Autowired
	SmppConfig smppConfig;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("SystemId: " + smppConfig.getSmppSystemId());
		System.out.println("Password: " + smppConfig.getSmppPassword());
	}

}
