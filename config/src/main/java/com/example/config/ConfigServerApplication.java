package com.example.config;

//O config além de ser um servidor de configuração,também é um cliente. Faz parte da arquitetura, precisamos verificar se ele está funcionando.
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer/*Tenho que ativar ela para habilitar como SERVIDOR DE CONFIGURACAO. Apos ter feito essa anotacao, faco as config para esse servidor acessar meu repositorio de configuracao. Faço a configuração para dizer onde vai acessar as configurações do meu git no application.yml*/
public class ConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication.class, args);
	}

}
