package com.app.rvz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.rvz.entity.Productsale;
import com.app.rvz.service.ProductService;

@CrossOrigin("http://localhost:5173")
@RestController
@RequestMapping("/product")
public class ProductController {
	 
		@Autowired
		ProductService serv;
		
		@GetMapping
		public List<Productsale> getUser(){
			return serv.getUser();
		}
		
		@PostMapping
		public String addUser(@RequestBody Productsale s) {
			serv.adduser(s);
			return "ok";
		}
}
