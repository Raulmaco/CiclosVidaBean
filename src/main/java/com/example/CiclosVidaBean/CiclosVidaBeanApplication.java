package com.example.CiclosVidaBean;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class CiclosVidaBeanApplication {

	public static void main(String[] args) {
		SpringApplication.run(CiclosVidaBeanApplication.class, args);

		Clase3 clase3 = new Clase3();
		clase3.escribe(args);

	}

}
