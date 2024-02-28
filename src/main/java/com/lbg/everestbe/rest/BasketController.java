package com.lbg.everestbe.rest;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lbg.everestbe.domain.Basket;
import com.lbg.everestbe.service.BasketService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RequestMapping("/basket")
@CrossOrigin
@RestController
public class BasketController {

	private BasketService service;

	public BasketController(BasketService service) {
		super();
		this.service = service;
	}

	@PostMapping("/create")
	public ResponseEntity<Basket> createBasket(@RequestBody Basket newBasket) {
		return this.service.createBasket(newBasket);
	}

	@GetMapping("/get")
	public List<Basket> getBasket() {
		return this.service.getBasket();
	}

	@GetMapping("/get/{id}")
	public ResponseEntity<Basket> getBasket(@PathVariable int id) {
		return this.service.getBasket(id);
	}

	@DeleteMapping("/delete/{id}")
	public boolean deleteBasket(@PathVariable int id) {
		return this.service.deleteBasket(id);

	}

	@PatchMapping("/update/{id}")
	public ResponseEntity<Basket> updateProperty(@PathVariable int id, @RequestBody Basket newBasket) {

		return this.service.updateBasket(id, newBasket);
	}

}
