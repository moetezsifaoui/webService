package com.webService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.webService.entity.Customer;
import com.webService.service.ICustomerService;

@RestController
public class CustomerController {
	@Autowired
	ICustomerService cs;
	
	@GetMapping(value = "/getCustomers")
	@ResponseBody
	public List<Customer> getCustomers() {
		return cs.getCustomers();
	}
	
	@PostMapping(value = "/addCustomer")
	@ResponseBody
	public void addCustomer(@RequestBody Customer customer) {
		 cs.addCustomer(customer);
	}
	
	@DeleteMapping(value = "/deleteCustomer/{id}")
	@ResponseBody
	public void deleteCustomer(@PathVariable("id") int id) {
		Customer customer = cs.getCustomerById(id);
		cs.deleteCustomer(customer);
	}
	
	@PutMapping(value = "/updateCustomer/{id}")
	@ResponseBody
	public void updateCustomer(@RequestBody Customer customer, @PathVariable("id") int id) {
		customer.setId(id);
		cs.updateCustomer(customer);
	}
	
}
