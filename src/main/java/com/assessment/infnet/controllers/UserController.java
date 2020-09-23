package com.assessment.infnet.controllers;

import com.assessment.infnet.models.dao.User;
import com.assessment.infnet.models.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public String addUser(Model model, User user) {
        userService.addUser(user);
        model.addAttribute("user", user);
        return "redirect:/home";
    }
}
