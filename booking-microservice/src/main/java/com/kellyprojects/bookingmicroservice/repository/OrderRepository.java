package com.kellyprojects.bookingmicroservice.repository;

import com.kellyprojects.bookingmicroservice.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
