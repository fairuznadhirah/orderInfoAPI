package com.accenture.orderInfo.controller;


import com.accenture.orderInfo.pojo.MagicPojo;
import com.accenture.orderInfo.pojo.WizardPojo;
import com.accenture.orderInfo.service.OrderService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.*;

@RestController
@RequestMapping("/api/order")
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;
    OrderService orderService;

    String url = "http://localhost:8081/api/wizard/test";
    String url2 = "http://localhost:8082/api/magicWand/test";
//    String url3 = "http://localhost:8081/api/demo/test/{id}";

    private static final Logger log = LoggerFactory.getLogger(OrderController.class);

    HttpHeaders headers = new HttpHeaders();

    HttpEntity<Object> requestEntity = new HttpEntity<>(headers);


    public OrderController(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }


    @GetMapping("/getAllOrder")
    public List<WizardPojo> getAllOrder() {
        ResponseEntity<List<WizardPojo>> responseWizard = restTemplate.exchange(url, HttpMethod.GET,
                null, new ParameterizedTypeReference<List<WizardPojo>>() {
                });


//        List<String> list = new ArrayList<>();
        List<WizardPojo> activeWizard = new ArrayList<>();


        for (WizardPojo wizardPojo : responseWizard.getBody()) {
            if (wizardPojo.getActive_wizard().equals("yes")) {
                activeWizard.add(wizardPojo);
            }
        }

//        return responseWizard.getBody().size();
        return activeWizard;
    }

    @GetMapping("/getAllMagic")
    public List<MagicPojo> getAllMagic() {

        ResponseEntity<List<MagicPojo>> responseMagic = restTemplate.exchange(url2, HttpMethod.GET,
                null, new ParameterizedTypeReference<List<MagicPojo>>() {
                });

        List<MagicPojo> stock = new ArrayList<>();

        for (MagicPojo magicPojo : responseMagic.getBody()) {
            if (magicPojo.getMagic_stock().equals(63)) {
                stock.add(magicPojo);
            }
        }
        return stock;
    }
}


//        int sizeWizard = responseWizard.getBody().size();
//        int ageMagic = responseMagic.getBody().get();

//        for (int i = 0; i < sizeWizard; i++) {
//            System.out.println(responseWizard.getBody().get(i).getWizard_name());
//            list.add(responseWizard.getBody().get(i).getActive_wizard());
//            if (list.get(i).equals("yes")) {
//                list.add(responseWizard.getBody().get(i).getActive_wizard());
//                log.info(responseWizard.getBody().get(i).getActive_wizard());
//            }
//        }

//    @GetMapping("/getAllOrder")
//    public String getAllOrder(){
//        try{
//            String responseFromWizard = restTemplate.getForObject(url, String.class);
//            String responseFromMagic = restTemplate.getForObject(url2, String.class);
//            String respondFromWizards = restTemplate.getForObject(url3, String.class);
//            return responseFromWizard + responseFromMagic ;
//        } catch (Exception e){
//            e.printStackTrace();
//            return "Some technical error";
//        }
//    }

//    private static final String url3 = "http://localhost:8081/api/demo/test/{id}";
//
//    public Order getOrderById(int id){
//        Map<String, Integer> param = new HashMap<String, Integer>();
//        param.put("id", id);
//        return restTemplate.getForObject(url3, Order.class, param);
////        return null;
//    }

//    @GetMapping("/test/{id}")
//    public List<Order> getOrder() {
//        return orderService.getOrders();
//    }
//
//    @PostMapping("/test/add")
//    public Order createOrder(@RequestBody Order order) {
//        return orderService.addOrder(order);
//    }
//
//    @DeleteMapping("/delete/{id}")
//    public void deleteOrder(@PathVariable(value = "id") long id) {
//        orderService.deleteOrder(id);
//    }
//
//    @PutMapping("/update")
//    public Order updateOrder(@RequestBody Order order){
//        return orderService.updateOrder(order);
//    }
//}
