package com.transactional.practicetransactional.Service;

import com.transactional.practicetransactional.Dto.OrderRequest;
import com.transactional.practicetransactional.Dto.OrderResponse;

public interface OrderService {

  OrderResponse placeOrder(OrderRequest orderRequest);
}
