package com.backend.help_mate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@EnableAutoConfiguration
public class HelpMateApplication {

	public static void main(String[] args) {
		System.out.println("adsads");
		SpringApplication.run(HelpMateApplication.class, args);
	}

}
