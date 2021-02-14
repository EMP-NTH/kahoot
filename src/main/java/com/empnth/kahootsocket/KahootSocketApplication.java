package com.empnth.kahootsocket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;

@SpringBootApplication
public class KahootSocketApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(KahootSocketApplication.class);
		app.setDefaultProperties(
				Collections.singletonMap(
						"server.port", "8181"
				)
		);
		app.run(args);
	}

}
