package com.transactional.practicetransactional.Service.Impl;

import java.util.UUID;

// import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.transactional.practicetransactional.Dto.OrderRequest;
import com.transactional.practicetransactional.Dto.OrderResponse;
import com.transactional.practicetransactional.Repository.OrderRepository;
import com.transactional.practicetransactional.Repository.PaymentRepository;
import com.transactional.practicetransactional.Service.OrderService;
import com.transactional.practicetransactional.model.Order;
import com.transactional.practicetransactional.model.Payment;

import jakarta.transaction.Transactional;

@Service
public class OrderServiceImpl implements OrderService {

  private OrderRepository orderRepository;
  private PaymentRepository paymentRepository;

  public OrderServiceImpl(OrderRepository orderRepository, PaymentRepository paymentRepository) {
    this.orderRepository = orderRepository;
    this.paymentRepository = paymentRepository;
  }

  @Override
  @Transactional
  public OrderResponse placeOrder(OrderRequest orderRequest) {

    Order order = orderRequest.getOrder();
    order.setStatus("INPROGRESS");
    order.setOrderTackingNumber(UUID.randomUUID().toString());
    orderRepository.save(order);

    Payment payment = orderRequest.getPayment();

    if (!payment.getType().equals("DEBIT")) {
      throw new PaymentException("Payment card type do not support");
    }

    payment.setOrderId(order.getId());
    paymentRepository.save(payment);

    OrderResponse orderResponse = new OrderResponse();
    orderResponse.setOrderTackingNumber(order.getOrderTackingNumber());
    orderResponse.setStatus(order.getStatus());
    orderResponse.setMessage("SUCCESS");
    return orderResponse;
  }
}
