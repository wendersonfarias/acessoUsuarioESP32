package com.wenderson.gerenciausuarios.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.wenderson.gerenciausuarios.services.DBService;



@Configuration
@Profile("teste")
public class TestConfig {
	
	@Autowired
	private DBService dbService;
	
	public void instaciaDb() {
		this.dbService.instanciaDb();
	}

}
