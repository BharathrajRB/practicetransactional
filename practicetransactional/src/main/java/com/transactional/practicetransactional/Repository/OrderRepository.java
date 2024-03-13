package com.transactional.practicetransactional.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.transactional.practicetransactional.model.orderInfo;

public interface OrderRepository extends JpaRepository<orderInfo, Long> {

}
