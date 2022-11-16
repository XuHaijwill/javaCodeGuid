package org.example.service;

import org.example.domain.User;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class UserService {
//        implements InitializingBean {

    @Autowired
    private OrderService orderService;

    @Autowired
    private User admin;

    public UserService(){
        System.out.println("1");
    }

/*
    public UserService(OrderService orderService){
        this.orderService = orderService;
        System.out.println("2");
    }

    public UserService(OrderService orderService,OrderService orderService1){
        this.orderService = orderService;
        System.out.println("3");
    }
*/

   /* @PostConstruct
    public void a() {
        // mysql --> user对象 --> admin

    }*/

    public void test() {
        System.out.println("test");
    }


//    @Override
//    public void afterPropertiesSet() throws Exception {
//        // mysql --> user对象 --> admin
//    }
}
