package com.cafe.cupofjoy.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cafe.cupofjoy.models.Sales;

public interface SalesRepository extends JpaRepository<Sales, Integer> {

}
