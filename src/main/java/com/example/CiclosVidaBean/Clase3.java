package com.example.CiclosVidaBean;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Clase3 {

    public void escribe(String [] args){
        for(int i=0; i< args.length; i++){
            System.out.println(args[i]);
        }
    }
}
