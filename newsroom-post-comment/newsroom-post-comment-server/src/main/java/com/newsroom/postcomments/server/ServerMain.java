package com.newsroom.postcomments.server;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.MongoTemplate;

@SpringBootApplication
public class ServerMain {

	public static MongoTemplate template;

	@Autowired
	private MongoTemplate mongoTemplate;

	public static void main(String[] args) throws Exception {
		SpringApplication.run(ServerMain.class, args);
	}

	@PostConstruct
	public void mongoSetup() {
		template = mongoTemplate;
	}

}
