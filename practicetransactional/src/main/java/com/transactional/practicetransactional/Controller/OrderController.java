package com.transactional.practicetransactional.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.transactional.practicetransactional.Dto.OrderAck;
import com.transactional.practicetransactional.Dto.OrderRequest;
import com.transactional.practicetransactional.Service.OrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class OrderController {
   
    @Autowired
    private OrderService orderService;

    @PostMapping("/place-order")
    public OrderAck postMethodName(@RequestBody OrderRequest request) {
return orderService.order(request);
    }

}
