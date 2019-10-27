package com.nabin.sdr.api;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDataRestapiApplication {
	
	@Autowired
	private UserRepository repository;
	
	@PostConstruct
	public void init() {
		repository.saveAll(Stream.of(
				new ApplicationUser(101,"Pratik","p@gmail.com"),
				new ApplicationUser(102,"Nabin","n@gmail.com"),
				new ApplicationUser(103,"Puspa","pk@gmail.com"),
				new ApplicationUser(104,"Uma","u@gmail.com"),
				new ApplicationUser(105,"Cena","c@gmail.com"))
				.collect(Collectors.toList()));
	}
	

	public static void main(String[] args) {
		SpringApplication.run(SpringDataRestapiApplication.class, args);
	}

}
