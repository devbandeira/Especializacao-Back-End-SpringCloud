package com.example.subscription.resource;

import com.example.subscription.service.SubscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/subscription")
public class SubscriptionResource {

    @Autowired
    private SubscriptionService service;


    //Feito um mapeamento somente para saber a porta que ele ta rodando. Separada em camadas
    //Fiz o servico "SubstriptionService" e dentro desse servico vai ter uma implementacao que vai retornar essa porta que ta rodando.
    @GetMapping("/port")
    public ResponseEntity<String> getPort(){
        return ResponseEntity.ok(service.getPort());
    }
}
