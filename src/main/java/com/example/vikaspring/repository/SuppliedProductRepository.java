package com.example.vikaspring.repository;

import com.example.vikaspring.model.SuppliedProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SuppliedProductRepository extends JpaRepository<SuppliedProduct,Integer> {
}
