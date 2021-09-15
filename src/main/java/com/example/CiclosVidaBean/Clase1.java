package com.example.CiclosVidaBean;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Clase1 {

    @PostConstruct
    public void ejecutate()
    {
        System.out.println("Línea a ejecutar cuando se haya instaciado esta clase");
    }
}


