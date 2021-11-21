package com.hsnjava.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hsnjava.crud.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
