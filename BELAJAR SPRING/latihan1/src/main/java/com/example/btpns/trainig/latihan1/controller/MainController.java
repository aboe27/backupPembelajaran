package com.example.btpns.trainig.latihan1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
    @RequestMapping(value = "/main", method = RequestMethod.GET)
    public String mainPage(Model model){
        model.addAttribute("nama","ini pesan dari controller gitu");
        return "index";
    }

    @RequestMapping("/")
    public String home(){
        return "redirect:/main";
    }

    @RequestMapping(value = "/regis", method = RequestMethod.GET)
    public String regiPage(Model model) {
        model.addAttribute("firstname","arif");
        model.addAttribute("fullname","arif budiman");
        return "data/data-diri";
    }

    @RequestMapping(value = "/manager", method = RequestMethod.GET)
    public String managPage(Model model){
        return "data/manager";
    }
}
