package com.mazeu.bookstore.config;

import com.mazeu.bookstore.service.DBservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("teste")
public class TesteConfig {

    @Autowired
    private DBservice dbService;

    @Bean
    public void instanciaBaseDeDados(){
        this.dbService.instanciaBaseDeDados();
    }
}
