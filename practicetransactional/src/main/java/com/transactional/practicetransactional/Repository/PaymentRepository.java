package com.transactional.practicetransactional.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.transactional.practicetransactional.Entity.PaymentInfo;

public interface PaymentRepository extends JpaRepository<PaymentInfo, Long> {

}
