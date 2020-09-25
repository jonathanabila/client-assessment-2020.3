package com.assessment.infnet.model.repositories;

import com.assessment.infnet.model.models.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(url = "http://localhost:8083/api/product", name = "productClient")
public interface IProductsRepository {
    @PostMapping(value = "/add")
    void addProduct(@RequestBody Product product);

    @DeleteMapping(value = "/{id}")
    void deleteProduct(@PathVariable Integer id);

    @GetMapping(value = "/")
    List<Product> getProducts();

    @GetMapping(value = "/{id}")
    Product getProduct(@PathVariable Integer id);
}
