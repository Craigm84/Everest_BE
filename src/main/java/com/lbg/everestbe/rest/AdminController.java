//package com.lbg.everestbe.rest;
//
//import java.util.List;
//
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PatchMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.lbg.everestbe.domain.Admin;
//import com.lbg.everestbe.service.AdminService;
//
//@CrossOrigin
//@RestController
//public class AdminController {
//
//	private AdminService service;
//
//	public AdminController(AdminService service) {
//		super();
//		this.service = service;
//	}
//
//	@PostMapping("/create")
//	public ResponseEntity<Admin> createAdmin(@RequestBody Admin newAdmin) {
//		return this.service.createAdmin(newAdmin);
//	}
//
//	@GetMapping("/get")
//	public List<Admin> getAdmin() {
//		return this.service.getAdmin();
//	}
//
//	@GetMapping("/get/{id}")
//	public ResponseEntity<Admin> getAdmin(@PathVariable int id) {
//		return this.service.getAdmin(id);
//	}
//
//	@DeleteMapping("/delete/{id}")
//	public boolean deleteAdmin(@PathVariable int id) {
//		return this.service.deleteAdmin(id);
//
//	}
//
//	@PatchMapping("/update/{id}")
//	public ResponseEntity<Admin> updateProperty(@PathVariable int id, @RequestBody Admin newAdmin) {
//
//		return this.service.updateAdmin(id, newAdmin);
//
//	}
//
//}
