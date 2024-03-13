package com.transactional.practicetransactional.Exception;

public class paymentInsufficient extends RuntimeException {
    public paymentInsufficient(String message) {
        super(message);
    }

}
