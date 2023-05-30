package com.example.subscription;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients//Ja tendo a biblioteca eu tenho que habilitar o feign. Preciso adicionar essa anotacao no servico que vai consumir. Como o course vai consumir o subscription eu poderia adicionar somente nele
@EnableDiscoveryClient
public class SubscriptionServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SubscriptionServiceApplication.class, args);
	}

}
