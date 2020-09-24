package com.assessment.infnet.controllers;

import com.assessment.infnet.model.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import java.util.Objects;

@Controller
@SessionAttributes("user")
public class AppController {

    @Autowired private UserService userService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showInit() { return "login"; }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String showLogin(Model model) {
        Object user = model.getAttribute("user");
        if (user != null) {
            return "redirect:/home";
        }
        return this.showInit();
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String showHome(Model model, @RequestParam String userName, @RequestParam String password) {
        boolean userExists = userService.userExists(userName);

        if (!userExists) {
            return "/signup";
        }
        Object user = userService.authenticate(userName, password);
        if(!Objects.isNull(user)) {
            model.addAttribute("user", user);
            return "redirect:/home";
        } else {
            model.addAttribute("error", "Usuário ou senha inválido!");
            return "login";
        }
    }

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String showHome() {
        return "home";
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout(SessionStatus session) {
        session.setComplete();
        return "login";
    }
}
