package com.bosch.eaa.cose;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.core.env.Environment;

@SpringBootApplication
@EnableConfigServer
public class CoseConfigServerApplication implements CommandLineRunner {
	@Autowired
	Environment env;

	public static void main(String[] args) {
		SpringApplication.run(CoseConfigServerApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		System.out.println("LOC" + env.getProperty("spring.cloud.config.server.git.uri"));

	}

}
