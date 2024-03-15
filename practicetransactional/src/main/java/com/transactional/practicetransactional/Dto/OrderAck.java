package com.transactional.practicetransactional.Dto;

import com.transactional.practicetransactional.Entity.PaymentInfo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderAck {
    private String status;
    private double amount;
    private PaymentInfo paymentInfo;
    
}
