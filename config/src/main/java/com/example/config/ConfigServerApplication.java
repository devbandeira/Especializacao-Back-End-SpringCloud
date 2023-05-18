package com.example.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer/*Tenho que ativar ela para habilitar como SERVIDOR DE CONFIGURACAO. Apos ter feito essa anotacao, faco as config para esse servidor acessar meu repositorio de configuracao*/
public class ConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication.class, args);
	}

}
