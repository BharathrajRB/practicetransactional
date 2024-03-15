package com.transactional.practicetransactional.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.transactional.practicetransactional.Entity.OrderInfo;

public interface OrderRepository extends JpaRepository<OrderInfo, Integer> {

}
