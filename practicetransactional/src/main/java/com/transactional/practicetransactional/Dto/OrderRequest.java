package com.transactional.practicetransactional.Dto;

import com.transactional.practicetransactional.model.Order;
import com.transactional.practicetransactional.model.Payment;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderRequest {
  private Order order;
  private Payment payment;
}
