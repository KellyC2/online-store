package com.kellyprojects.stock_microservice.controller;

import com.kellyprojects.stock_microservice.entity.StockEntity;
import com.kellyprojects.stock_microservice.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/stock")
public class StockController {
    @Autowired
    private StockRepository stockRepository;
    @RequestMapping("/{code}")
    public boolean stockAvailable(@PathVariable String code){
        Optional<StockEntity> stock=stockRepository.findByCode(code);

        stock.orElseThrow(()->new RuntimeException("Couldn't find the product " + code ));

        return stock.get().getQuantity() > 0;
    }
}
