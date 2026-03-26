package com.app.rvz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.rvz.entity.Productsale;
import com.app.rvz.repository.ProdoctRepository;

@Service
public class ProductService {
	
	@Autowired
	ProdoctRepository repo;
	
	public String adduser(Productsale s) {
		repo.save(s);
		return "ok";
	}
	
	public List<Productsale> getUser(){
		return repo.findAll();
	}
}
