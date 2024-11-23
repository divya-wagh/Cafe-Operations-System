package com.cafe.cupofjoy.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cafe.cupofjoy.models.*;

public interface CustomerRepository extends JpaRepository<Customers, Integer> {

}
