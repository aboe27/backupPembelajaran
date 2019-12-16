package com.btpns.training.des13.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RestController
public class MainController {
    @RequestMapping("/hello")
    public String sayHello(@RequestParam(value = "name")String name){
        return "hello " + name;
    }

    @GetMapping("/main")
    public String home(Model model){
        model.addAttribute("message", "oke");
        return "main/index";
    }
}
