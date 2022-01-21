package com.webService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webService.entity.Customer;
import com.webService.repository.CustomerRepository;

@Service
public class CustomerService implements ICustomerService {
	
	@Autowired
	CustomerRepository cr;

	@Override
	public void addCustomer(Customer customer) {
		cr.save(customer);
	}

	@Override
	public List<Customer> getCustomers() {
		return (List<Customer>) cr.findAll();
	}

	@Override
	public void deleteCustomer(Customer customer) {
		cr.delete(customer);
	}

	@Override
	public void updateCustomer(Customer customer) {
		cr.save(customer);
	}

	@Override
	public Customer getCustomerById(int id) {
		return cr.findById(id).get();
	}

}
