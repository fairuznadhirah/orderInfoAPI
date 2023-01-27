//package com.accenture.orderInfo.entity;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.client.RestTemplate;
//
//import java.util.Arrays;
//import java.util.List;
//
//@RestController
//@RequestMapping(value = "/api/demo")
//
//public class restTemplate {
//
//    @Autowired
//    RestTemplate restTemplate;
//
//    @GetMapping("/test")
//    public List<Object> getId(){
//        String url = "localhost:8081/api/demo/test";
//        Object[] objects = restTemplate.getForObject(url, Object[].class);
//
//        return Arrays.asList(objects);
//    }
//
////    @PostMapping("/test/add")
////    public List<Order> get
////
//
//}
