package com.crichub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

import com.crichub.home.HomeScreenController;

@SpringBootApplication
public class CrichubApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrichubApplication.class, args);
	}

}
