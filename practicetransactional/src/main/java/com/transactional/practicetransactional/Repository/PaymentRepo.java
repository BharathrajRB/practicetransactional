package com.transactional.practicetransactional.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.transactional.practicetransactional.model.PaymentInfo;

public interface PaymentRepo extends JpaRepository<PaymentInfo, Long> {

}
