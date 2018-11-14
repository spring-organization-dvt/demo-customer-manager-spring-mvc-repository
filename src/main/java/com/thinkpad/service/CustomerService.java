package com.thinkpad.service;

import com.thinkpad.model.Customer;
import com.thinkpad.model.Province;

import java.util.List;

public interface CustomerService {
    Iterable<Customer> findAll();

    Customer findById(Long id);

    void save(Customer customer);

    void remove(Long id);

    Iterable<Customer> findAllByProvince(Province province);
}
