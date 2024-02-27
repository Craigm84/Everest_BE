package com.lbg.everestbe.service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.lbg.everestbe.domain.Item;
import com.lbg.everestbe.repo.ItemRepo;

@Service
public class ItemService {

	private ItemRepo repo;

	public ItemService(ItemRepo repo) {
		super();
		this.repo = repo;
	}

	public ResponseEntity<Item> createItem(Item newItem) {
		Item created = this.repo.save(newItem);
		return new ResponseEntity<Item>(created, HttpStatus.CREATED);
	}

	public List<Item> getItem() {
		return this.repo.findAll();
	}

	public ResponseEntity<Item> getItem(int id) {
		Optional<Item> found = this.repo.findById(id);

		if (found.isEmpty()) {
			return new ResponseEntity<Item>(HttpStatus.NOT_FOUND);
		}
		Item body = found.get();
		return ResponseEntity.ok(body);
	}

	public boolean deleteItem(int id) {
		this.repo.deleteById(id);
		return !this.repo.existsById(id);
	}

	public ResponseEntity<Item> updateItem(int id, Item newItem) {
		Optional<Item> found = this.repo.findById(id);

		if (found.isEmpty()) {

			return new ResponseEntity<Item>(HttpStatus.NOT_FOUND);
		}

		Item body = found.get();

		if (newItem.getName() != null)
			body.setName(newItem.getName());
		if (newItem.getPrice() != null)
			body.setPrice(newItem.getPrice());
		if (newItem.getQuantity() != null)
			body.setQuantity(newItem.getQuantity());

		Item updated = this.repo.save(body);

		return ResponseEntity.ok(updated);
	}

}
