package com.transactional.practicetransactional.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.transactional.practicetransactional.model.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
