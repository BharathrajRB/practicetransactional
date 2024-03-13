package com.transactional.practicetransactional.Dto;

import com.transactional.practicetransactional.model.PaymentInfo;
import com.transactional.practicetransactional.model.orderInfo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderReqest {
    private orderInfo OrderInfo;
    private PaymentInfo paymentInfo;

}
