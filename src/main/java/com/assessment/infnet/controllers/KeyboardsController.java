package com.assessment.infnet.controllers;

import com.assessment.infnet.model.models.Keyboard;
import com.assessment.infnet.model.models.Product;
import com.assessment.infnet.model.services.KeyboardsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class KeyboardsController {

    @Autowired private KeyboardsService keyboardsService;

    @GetMapping(value = "/keyboard")
    public String addPage(Model model) {
        return "keyboard/add";
    }

    @GetMapping(value = "/keyboards")
    public String getAll(Model model) {
        List<? extends Product> keyboardList = keyboardsService.getAll();
        model.addAttribute("keyboards", keyboardList);
        return "keyboard/all";
    }

    @PostMapping(value = "/keyboard")
    public String add(Keyboard keyboard) {
        keyboardsService.add(keyboard);
        return "redirect:/keyboards";
    }

    @GetMapping(value = "/keyboard/{id}/delete")
    public String delete(Model model, @PathVariable Integer id) {
        try {
            keyboardsService.delete(id);
        } catch (Exception e) {
            model.addAttribute("error", "Esse produto está relacionado a uma venda!");
            return this.getAll(model);
        }

        return "redirect:/keyboards";
    }

    @GetMapping(value = "/keyboard/{id}/update")
    public String update(Model model, @PathVariable Integer id) {
        Keyboard keyboard = keyboardsService.getById(id);
        model.addAttribute("keyboard", keyboard);
        return "keyboard/add";
    }
}
