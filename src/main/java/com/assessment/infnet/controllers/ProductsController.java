package com.assessment.infnet.controllers;

import com.assessment.infnet.model.models.Product;
import com.assessment.infnet.model.services.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ProductsController {

    @Autowired private ProductsService productsService;

    @GetMapping(value = "/products")
    public String getAll(Model model) {
        List<? extends Product> productsList = productsService.getAll();
        model.addAttribute("products", productsList);
        return "product/all";
    }
}
