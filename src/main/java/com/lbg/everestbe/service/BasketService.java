//package com.lbg.everestbe.service;
//
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Service;
//
//import com.lbg.everestbe.domain.Basket;
//import com.lbg.everestbe.repo.BasketRepo;
//
//@Service
//public class BasketService {
//
//	private BasketRepo repo;
//
//	public BasketService(BasketRepo repo) {
//		super();
//		this.repo = repo;
//	}
//
//	public ResponseEntity<Basket> createBasket(Basket newBasket) {
//		Basket created = this.repo.save(newBasket);
//		return new ResponseEntity<Basket>(created, HttpStatus.CREATED);
//	}
//
//	public List<Basket> getBasket() {
//		return this.repo.findAll();
//	}
//
//	public ResponseEntity<Basket> getBasket(int id) {
//		Optional<Basket> found = this.repo.findById(id);
//
//		if (found.isEmpty()) {
//			return new ResponseEntity<Basket>(HttpStatus.NOT_FOUND);
//		}
//		Basket body = found.get();
//		return ResponseEntity.ok(body);
//	}
//
//	public boolean deleteBasket(int id) {
//		this.repo.deleteById(id);
//		return !this.repo.existsById(id);
//	}
//
//	public ResponseEntity<Basket> updateBasket(int id, Basket newBasket) {
//		Optional<Basket> found = this.repo.findById(id);
//
//		if (found.isEmpty()) {
//
//			return new ResponseEntity<Basket>(HttpStatus.NOT_FOUND);
//		}
//
//		Basket body = found.get();
//
//		Basket updated = this.repo.save(body);
//
//		return ResponseEntity.ok(updated);
//	}
//
//}
