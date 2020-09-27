package com.assessment.infnet.controllers;

import com.assessment.infnet.model.models.Buyer;
import com.assessment.infnet.model.services.BuyersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class BuyersController {

    @Autowired private BuyersService buyersService;

    @GetMapping(value = "/buyer")
    public String addPage(Model model) {
        return "buyer/add";
    }

    @GetMapping(value = "/buyers")
    public String getAll(Model model) {
        List<Buyer> buyersList = buyersService.getAll();
        model.addAttribute("buyers", buyersList);
        return "buyer/all";
    }

    @PostMapping(value = "/buyer")
    public String add(Buyer buyer) {
        buyersService.add(buyer);
        return "redirect:/buyers";
    }

    @GetMapping(value = "/buyer/{id}/delete")
    public String delete(Model model, @PathVariable Integer id) {
        try {
            buyersService.delete(id);
        } catch (Exception e) {
            model.addAttribute("error", "Esse comprador está relacionado a uma venda!");
            return this.getAll(model);
        }
        return "redirect:/buyers";
    }

    @GetMapping(value = "/buyer/{id}/update")
    public String update(Model model, @PathVariable Integer id) {
        Buyer buyer = buyersService.getById(id);
        model.addAttribute("buyer", buyer);
        return "buyer/add";
    }
}
