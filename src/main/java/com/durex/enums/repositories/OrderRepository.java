package com.durex.enums.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.durex.enums.entities.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}

