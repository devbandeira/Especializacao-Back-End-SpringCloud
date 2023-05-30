package com.example.course.service.impl;

import com.example.course.service.CourseService;
import com.example.course.service.SubscriptionClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl  implements CourseService {

    @Autowired
    private SubscriptionClient subscriptionService;

    //retorna essa porta indo buscar la no subscriptionService, implementei uma interface, dentro dessa interface "SubscriptionService" terei as anotaccoes
    @Override
    public String getSubscriptionPort() {
        var port = subscriptionService.getPort();
        System.out.println(port);
        return port;
    }
}
