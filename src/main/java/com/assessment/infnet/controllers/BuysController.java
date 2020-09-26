package com.assessment.infnet.controllers;

import com.assessment.infnet.model.models.Buy;
import com.assessment.infnet.model.models.Buyer;
import com.assessment.infnet.model.models.Product;
import com.assessment.infnet.model.services.BuyersService;
import com.assessment.infnet.model.services.BuysService;
import com.assessment.infnet.model.services.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BuysController {

    @Autowired private BuysService buyService;
    @Autowired private ProductsService productsService;
    @Autowired private BuyersService buyersService;

    @GetMapping(value = "/buy")
    public String addPage(Model model) {
        List<? extends Product> productList = productsService.getAll();
        List<Buyer> buyerList = buyersService.getAll();

        model.addAttribute("products", productList);
        model.addAttribute("buyers", buyerList);

        return "buy/add";
    }

    @GetMapping(value = "/buy/{id}")
        public String getBuy(Model model, @PathVariable Integer id) {
        Buy buy = buyService.getById(id);
        model.addAttribute("buy", buy);
        return "buy/details";
    }

    @GetMapping(value = "/buys")
    public String getAll(Model model) {
        List<Buy> buyList = buyService.getAll();
        model.addAttribute("buys", buyList);
        return "buy/all";
    }

    @PostMapping(value = "/buy")
    public String add(Buy buy, @RequestParam String[] productsIds) {
        buy.buyer = buyersService.getById(buy.buyer.id);

        List<Product> productList = new ArrayList<>();
        for(String id: productsIds) {
            productList.add(productsService.getById(Integer.valueOf(id)));
        }
        buy.setItems(productList);

        buyService.add(buy);
        return "redirect:/buys";
    }
}
