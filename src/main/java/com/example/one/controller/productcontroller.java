package com.example.one.controller;


import com.example.one.model.Product;
import com.example.one.service.productservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class productcontroller {
    @Autowired
    productservice service;

    @GetMapping("/products")
    public List<Product> getProduct(){
        return service.getProducts();
    }

    @GetMapping("/products/{proId}")
    public Product getProductById(@PathVariable int proId){
        return service.getProductById(proId);
    }

    @PostMapping("/products")
    public void addproduct(@RequestBody Product pro){
        service.addproduct(pro);
    }

    @PutMapping("/products")
    public void updateproduct(@RequestBody Product pro){
        service.updateproduct(pro);
    }

    @DeleteMapping("/product/{proid}")
    public void deleteproduct(@PathVariable int proid){
        service.deleteproduct(proid);
    }

}
