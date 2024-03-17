package com.transactional.practicetransactional.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.transactional.practicetransactional.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
