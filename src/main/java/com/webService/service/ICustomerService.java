package com.webService.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.webService.entity.Customer;

@Service
public interface ICustomerService {
	void addCustomer(Customer customer);
	List<Customer> getCustomers();
	void deleteCustomer(Customer customer);
	void updateCustomer(Customer customer);
	Customer getCustomerById(int id);

}
