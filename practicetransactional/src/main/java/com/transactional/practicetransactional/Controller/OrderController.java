package com.transactional.practicetransactional.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.transactional.practicetransactional.Dto.OrderAck;
import com.transactional.practicetransactional.Dto.OrderReqest;
import com.transactional.practicetransactional.Service.OrderService;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/orders")
    public OrderAck placeOrder(@RequestBody OrderReqest orderReqest) {
        return orderService.placeOrder(orderReqest);

    }
}
