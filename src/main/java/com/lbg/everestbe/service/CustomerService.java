package com.lbg.everestbe.service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.lbg.everestbe.domain.Customer;
import com.lbg.everestbe.repo.CustomerRepo;

@Service
public class CustomerService {

	private CustomerRepo repo;

	public CustomerService(CustomerRepo repo) {
		super();
		this.repo = repo;
	}

	public List<Customer> getCustomer() {
		return this.repo.findAll();
	}

	public ResponseEntity<Customer> createCustomer(Customer newCustomer) {
		Customer created = this.repo.save(newCustomer);
		return new ResponseEntity<Customer>(created, HttpStatus.CREATED);
	}

	public ResponseEntity<Customer> getCustomer(int id) {
		Optional<Customer> found = this.repo.findById(id);

		if (found.isEmpty()) {
			return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
		}

		Customer body = found.get();

		return ResponseEntity.ok(body);
	}

	public boolean deleteCustomer(int id) {
		this.repo.deleteById(id);
		return !this.repo.existsById(id);
	}

	public ResponseEntity<Customer> updateCustomer(int id, Customer newCustomer) {
		Optional<Customer> found = this.repo.findById(id);

		if (found.isEmpty()) {

			return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
		}

		Customer body = found.get();

		if (newCustomer.getName() != null)
			body.setName(newCustomer.getName());
		if (newCustomer.getAddress() != null)
			body.setAddress(newCustomer.getAddress());
		if (newCustomer.getEmail() != null)
			body.setEmail(newCustomer.getEmail());
		if (newCustomer.getPhone() != null)
			body.setPhone(newCustomer.getPhone());
		if (newCustomer.getUsername() != null)
			body.setUsername(newCustomer.getUsername());
		if (newCustomer.getPassword() != null)
			body.setPassword(newCustomer.getPassword());
		if (newCustomer.getItems() != null)
			body.setItems(newCustomer.getItems());

		Customer updated = this.repo.save(body);

		return ResponseEntity.ok(updated);
	}

}
