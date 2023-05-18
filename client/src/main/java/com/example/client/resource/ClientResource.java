package com.example.client.resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")
public class ClientResource {

    /*A5 - */
    @GetMapping("/boa")
    public ResponseEntity<String> pegar(){
        return ResponseEntity.ok("vai dar nada nao");
    }
    @Value("${message}")
    private String message;/*A5 - essa message vai se puxada como variavel ambiente, la dentro do application.yml no meu git que vem atraves do config server*/

    @GetMapping
    public ResponseEntity<String> getString() {
        return ResponseEntity.ok("clientResource");
    }

    @GetMapping("/message")/*A5 - */
    public ResponseEntity<String> getMessage() {return ResponseEntity.ok(this.message);}
}
