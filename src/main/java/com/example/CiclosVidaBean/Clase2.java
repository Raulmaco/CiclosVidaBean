package com.example.CiclosVidaBean;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Clase2 {

    @Bean
    CommandLineRunner ejecutame(){
        return p-> {
            System.out.println("Linea a ejecutar cuando arranque");
        };
    }
}

