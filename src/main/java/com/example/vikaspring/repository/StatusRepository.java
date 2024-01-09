package com.example.vikaspring.repository;

import com.example.vikaspring.model.Status;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatusRepository extends JpaRepository<Status, Integer> {
}
