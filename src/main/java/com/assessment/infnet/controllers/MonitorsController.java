package com.assessment.infnet.controllers;

import com.assessment.infnet.model.models.Monitor;
import com.assessment.infnet.model.models.Product;
import com.assessment.infnet.model.services.MonitorsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class MonitorsController {

    @Autowired private MonitorsService monitorsService;

    @GetMapping(value = "/monitor")
    public String addPage(Model model) {
        return "monitor/add";
    }

    @GetMapping(value = "/monitors")
    public String getAll(Model model) {
        List<? extends Product> monitorList = monitorsService.getAll();
        model.addAttribute("monitors", monitorList);
        return "monitor/all";
    }

    @PostMapping(value = "/monitor")
    public String add(Monitor monitor) {
        monitorsService.add(monitor);
        return "redirect:/monitors";
    }

    @GetMapping(value = "/monitor/{id}/delete")
    public String delete(Model model, @PathVariable Integer id) {
        try {
            monitorsService.delete(id);
        } catch (Exception e) {
            model.addAttribute("error", "Esse produto está relacionado a uma venda!");
            return this.getAll(model);
        }
        return "redirect:/monitors";
    }
}
