package com.transactional.practicetransactional.Util;

import java.util.HashMap;
import java.util.Map;

import com.transactional.practicetransactional.Exception.paymentInsufficient;
import com.transactional.practicetransactional.model.PaymentInfo;

public class PaymentValidation {

    private static Map<String, Double> paymentMap = new HashMap<>();
    static {
        paymentMap.put("Mobile", 20000.0);
        paymentMap.put("Laptop", 25000.90);
        paymentMap.put("Tablet", 100000.0);
        paymentMap.put("Charger", 250.90);
    }

    public static boolean validatePaymentInfo(PaymentInfo paymentInfo) {
        if (paymentInfo.getAmount() < paymentMap.get(paymentInfo.getProductName())) {
            throw new paymentInsufficient("payment unsucessfull");
        } else {
            return true;
        }
    }
}
