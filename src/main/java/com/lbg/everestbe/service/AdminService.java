//package com.lbg.everestbe.service;
//
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//
//import com.lbg.everestbe.domain.Item;
//
//public class AdminService {
//	
//	public List<Item> getItem() {
//		return this.repo.findAll();
//	}
//
//	public ResponseEntity<Item> getItem(int id) {
//		Optional<Item> found = this.repo.findById(id);
//
//		if (found.isEmpty()) {
//			return new ResponseEntity<Item>(HttpStatus.NOT_FOUND);
//		}
//		Item body = found.get();
//		return ResponseEntity.ok(body);
//	}
//
//
//}
