package com.java.examples.spring5.repositories;

import com.java.examples.spring5.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
