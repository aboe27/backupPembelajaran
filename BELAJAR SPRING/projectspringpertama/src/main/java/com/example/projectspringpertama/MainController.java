package com.example.projectspringpertama;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @RequestMapping("/helo")
    public String sayHello(@RequestParam(value = "name") String name){
        return "helo" +name;
    }

}
