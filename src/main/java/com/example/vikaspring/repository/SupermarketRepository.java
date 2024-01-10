package com.example.vikaspring.repository;

import com.example.vikaspring.model.Supermarket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupermarketRepository extends JpaRepository<Supermarket,Integer> {
}
