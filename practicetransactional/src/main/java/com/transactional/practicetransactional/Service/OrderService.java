package com.transactional.practicetransactional.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.transactional.practicetransactional.Dto.OrderAck;
import com.transactional.practicetransactional.Dto.OrderRequest;
import com.transactional.practicetransactional.Entity.OrderInfo;
import com.transactional.practicetransactional.Entity.PaymentInfo;
import com.transactional.practicetransactional.Repository.OrderRepository;
import com.transactional.practicetransactional.Repository.PaymentRepository;
import static com.transactional.practicetransactional.Util.PaymentValidation.validatePayment;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private PaymentRepository paymentRepository;

    public OrderAck order(OrderRequest request) {
        OrderInfo orderInfo = request.getOrderInfo();
        orderInfo = orderRepository.save(orderInfo);
        PaymentInfo paymentInfo = request.getPaymentInfo();
        validatePayment(paymentInfo);
        // Remove this line ↓
        // orderInfo.setProductName(paymentInfo.getProductName());
        orderRepository.save(orderInfo);
        paymentRepository.save(paymentInfo);
        return new OrderAck("success", paymentInfo.getAmount(), paymentInfo);
    }

}
