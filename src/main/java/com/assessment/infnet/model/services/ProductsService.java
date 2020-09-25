package com.assessment.infnet.model.services;

import com.assessment.infnet.model.models.Product;
import com.assessment.infnet.model.repositories.IProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductsService {
    @Autowired
    private IProductsRepository productsRepository;

    public void Add(Product product) {
        productsRepository.addProduct(product);
    }

    public List<Product> getAll() {
        return productsRepository.getProducts();
    }

    public void delete(Integer id) {
        productsRepository.deleteProduct(id);
    }

    public Product getById(Integer id) {
        return productsRepository.getProduct(id);
    }
}
