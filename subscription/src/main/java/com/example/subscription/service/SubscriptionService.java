package com.example.subscription.service;

import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("SUBSCRIPTION-SERVICE")//Anoto que a interface é um FeignCliente. Dentro dos () passo o parametro de qual servico ele vai estar consumindo. E o mesmo nome que vai estar no painel do EUREKA, nas instancias logadas e registradas com EUREKA, nome logo abaixo do application
@LoadBalancerClient("SUBSCRIPTION-SERVICE")//dentro do subscritionService eu adciono outra notacao @LoadBalancerClient falando que quero que ele tenha o comportamento de loadbalance
public interface SubscriptionService {

    //E ele vai fazer uma requiscao nesse endpoint retornando uma string
    @GetMapping("/subscription/port")//Pego esse mapeamento no CONTROLLER do subscription
    String getPort();
}
