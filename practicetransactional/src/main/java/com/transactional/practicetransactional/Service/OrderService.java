package com.transactional.practicetransactional.Service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import static com.transactional.practicetransactional.Util.PaymentValidation.validatePaymentInfo;
import com.transactional.practicetransactional.Dto.OrderAck;
import com.transactional.practicetransactional.Dto.OrderReqest;
import com.transactional.practicetransactional.Exception.paymentInsufficient;
import com.transactional.practicetransactional.Repository.OrderRepository;
import com.transactional.practicetransactional.Repository.PaymentRepo;
import com.transactional.practicetransactional.model.PaymentInfo;
import com.transactional.practicetransactional.model.orderInfo;

import jakarta.transaction.Transactional;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private PaymentRepo paymentRepo;

    @Transactional

    public OrderAck placeOrder(OrderReqest orderReqest) {
        orderInfo OrderInfo = orderReqest.getOrderInfo();
      //  OrderInfo = orderRepository.save(OrderInfo);

        PaymentInfo paymentInfo = orderReqest.getPaymentInfo();
        validatePaymentInfo(paymentInfo);
        OrderInfo.setProductName(paymentInfo.getProductName());
        orderRepository.save(OrderInfo);
        paymentRepo.save(paymentInfo);
        return new OrderAck("Success", paymentInfo.getAmount(), paymentInfo);

    }

}
