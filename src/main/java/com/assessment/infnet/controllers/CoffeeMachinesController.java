package com.assessment.infnet.controllers;


import com.assessment.infnet.model.models.CoffeeMachine;
import com.assessment.infnet.model.models.Product;
import com.assessment.infnet.model.services.CoffeeMachinesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class CoffeeMachinesController {

    @Autowired private CoffeeMachinesService coffeeMachinesService;

    @GetMapping(value = "/coffee-machine")
    public String addPage(Model model) {
        return "coffee-machine/add";
    }

    @GetMapping(value = "/coffee-machines")
    public String getAll(Model model) {
        List<? extends Product> coffeeMachineList = coffeeMachinesService.getAll();
        model.addAttribute("coffeeMachines", coffeeMachineList);
        return "coffee-machine/all";
    }

    @PostMapping(value = "/coffee-machine")
    public String add(CoffeeMachine coffeeMachine) {
        coffeeMachinesService.add(coffeeMachine);
        return "redirect:/coffee-machines";
    }

    @GetMapping(value = "/coffee-machine/{id}/delete")
    public String delete(Model model, @PathVariable Integer id) {
        try {
            coffeeMachinesService.delete(id);
        } catch (Exception e) {
            model.addAttribute("error", "Esse produto está relacionado a uma venda!");
            return this.getAll(model);
        }

        return "redirect:/coffee-machines";
    }

    @GetMapping(value = "/coffee-machine/{id}/update")
    public String update(Model model, @PathVariable Integer id) {
        CoffeeMachine coffeeMachine = coffeeMachinesService.getById(id);
        model.addAttribute("coffeeMachine", coffeeMachine);
        return "coffee-machine/add";
    }
}
