package com.transactional.practicetransactional.Dto;

import com.transactional.practicetransactional.Entity.OrderInfo;
import com.transactional.practicetransactional.Entity.PaymentInfo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderRequest {

    private OrderInfo orderInfo;
    private PaymentInfo paymentInfo;
}
