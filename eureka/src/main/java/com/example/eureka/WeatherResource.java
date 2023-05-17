package com.example.eureka;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*Revisao de como se declara um endpoit*/
@RestController
@RequestMapping("/weather")/*Toda a pagina para chamada vai comecar com weather*/
public class WeatherResource {

    @GetMapping("/message/{city}")/*faco um get, passando um PATH {} para ele.*/
    public ResponseEntity<String> getMessage(@PathVariable String city) {/*pego path e retorno ele nesse metodo*/
        return ResponseEntity.ok(city);
    }
}
