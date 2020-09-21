package com.assessment.infnet.controllers;

import com.assessment.infnet.models.dao.User;
import com.assessment.infnet.models.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@SessionAttributes("user")
public class AppController {

    @Autowired private UserService userService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showInit() { return "login"; }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String showLogin() { return this.showInit(); }

    @GetMapping(value = "/home")
    public String showHome() {
        return "home";
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String showHome(Model model, @RequestParam String userName, @RequestParam String password) {
        User user = userService.userExists(userName);

        if (user == null) {
            return "/signup";
        } else if(userService.authenticate(userName, password)) {
            model.addAttribute("user", user);
            return "redirect:/home";
        } else {
            model.addAttribute("error", "Usuário ou senha inválido!");
            return "login";
        }
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout(SessionStatus session) {
        session.setComplete();
        return "login";
    }
}
