package com.transactional.practicetransactional.Util;

public class InsufficientAmount extends RuntimeException {
    public InsufficientAmount(String message) {
        super(message);
    }

}
