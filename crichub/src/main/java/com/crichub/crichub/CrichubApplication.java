package com.crichub.crichub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.crichub.home.HomeScreenController;

@SpringBootApplication
public class CrichubApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrichubApplication.class, args);
		com.crichub.home.HomeScreenController HomeScreenController = new HomeScreenController();
		try{
			HomeScreenController.showHomeScreen();
		} catch (Exception e){
			e.printStackTrace();
		}
	}

}
