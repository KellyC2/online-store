package com.kellyprojects.productmicroservice.controller;

import com.kellyprojects.productmicroservice.entity.ProductEntity;
import com.kellyprojects.productmicroservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/products")
public class ProductController {
    @Autowired
    private ProductRepository productRepository;
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductEntity> getAllProducts(){
        return productRepository.findAll();
    }

//    @GetMapping
//    public ResponseEntity<List<ProductEntity>> getAllProduct(){
//        List<ProductEntity> savedProducts= productRepository.findAll();
//        ResponseEntity<List<ProductEntity>> responseEntity=new ResponseEntity<>(savedProducts, HttpStatus.OK);
//        return responseEntity;
//    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody ProductEntity product){
        productRepository.save(product);
    }


}
