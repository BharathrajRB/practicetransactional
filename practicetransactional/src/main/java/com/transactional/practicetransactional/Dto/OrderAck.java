package com.transactional.practicetransactional.Dto;

import com.transactional.practicetransactional.model.PaymentInfo;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class OrderAck {

    private String status;
    private double payableAmt;
    private PaymentInfo paymentInfo;
}
