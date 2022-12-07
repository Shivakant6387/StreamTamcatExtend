package com.example.externalTomcat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class ExternalTomcatApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(ExternalTomcatApplication.class, args);
	}

@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return super.configure(builder);
	}
}
