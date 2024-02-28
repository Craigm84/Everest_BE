//package com.lbg.everestbe.domain;
//
//import java.util.List;
//
//import com.fasterxml.jackson.annotation.JsonManagedReference;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.OneToMany;
//
//@Entity
//public class Basket {
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Integer id;
//
//	public Basket() {
//		super();
//	}
//
//	public Basket(Integer basketId) {
//		super();
//	}
//
//	@JsonManagedReference
//	@OneToMany(mappedBy = "customer")
//	private List<Item> items;
//
//	public Integer getId() {
//		return id;
//	}
//
//	public void setId(Integer id) {
//		this.id = id;
//	}
//
//	public List<Item> getItems() {
//		return items;
//	}
//
//	public void setItems(List<Item> items) {
//		this.items = items;
//	}
//
//	@Override
//	public String toString() {
//		return "Basket ID=" + id + ", Items=" + items + ", Get Items=" + getItems();
//	}
//
//}
