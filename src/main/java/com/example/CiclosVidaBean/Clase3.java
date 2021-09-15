package com.example.CiclosVidaBean;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Clase3 {

    @Bean
    CommandLineRunner ejecutargumentos(){
        return p-> {
            for(String s: p)
                System.out.println("argumentos: "+ s);
        };
    }



}
