package com.transactional.practicetransactional.Util;

import java.util.HashMap;
import java.util.Map;

import com.transactional.practicetransactional.Entity.PaymentInfo;

public class PaymentValidation {

    private static Map<String, Double> paymentMap = new HashMap<>();

    static {
        paymentMap.put("Mobile", 20000.0);
        paymentMap.put("Laptop", 60000.0);
        paymentMap.put("Tablet", 10000.0);
        paymentMap.put("Charger", 100.0);

    }

    public static boolean validatePayment(PaymentInfo paymentInfo) {

        if (paymentInfo.getAmount() < paymentMap.get(paymentInfo.getProductName())) {

            throw new InsufficientAmount("the amount is not sufficient ");
        } else {
            return true;
        }
    }

}
