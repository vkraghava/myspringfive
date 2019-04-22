package com.java.examples.spring5.bootstrap;

import com.java.examples.spring5.domain.Customer;
import com.java.examples.spring5.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {

    private final CustomerRepository customerRepository;

    public BootstrapData(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }


    @Override
    public void run(String... args) throws Exception {
        System.out.println("Loading Customer Data");

        Customer c1 = new Customer();
        c1.setFirstName("First Name 1");
        c1.setLastName("Last Name 2");
        customerRepository.save(c1);

        Customer c2 = new Customer();
        c2.setFirstName("First Name 1");
        c2.setLastName("Last Name 2");
        customerRepository.save(c2);

        Customer c3 = new Customer();
        c3.setFirstName("First Name 1");
        c3.setLastName("Last Name 2");
        customerRepository.save(c3);

        System.out.println("Customer Saved "+ customerRepository.count());
    }
}
