package com.crud.aplicacaocrud.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.aplicacaocrud.domain.product.ProductRepository;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductRepository repository;
    @GetMapping
    public ResponseEntity getAllProduct(){
        var allProduct = repository.findAll();
        return ResponseEntity.ok(allProduct);


    }

}
