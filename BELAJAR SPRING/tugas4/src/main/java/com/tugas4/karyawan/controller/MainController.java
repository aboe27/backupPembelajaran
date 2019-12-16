package com.tugas4.karyawan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Controller
public class MainController {
    @RequestMapping(value = "/main", method = RequestMethod.GET)
    public String mainPage(Model model){
        model.addAttribute("nama", "ariif");
        return "index";
    }
    public String home(){
        return "redirect:/main";
    }

    @RequestMapping(value = "/karyawan", method = RequestMethod.GET)
    public String karyPage(Model model){
        List<String>krybackend= new ArrayList<String>();
        List<String>kryfrontend= new ArrayList<String>();

        krybackend.add("arif");
        krybackend.add("misbah");
        krybackend.add("karin");
        krybackend.add("gery");
        krybackend.add("cecep");

        kryfrontend.add("virza");
        kryfrontend.add("haekal");
        kryfrontend.add("andika");

        krybackend.addAll(kryfrontend);

        model.addAttribute("list",krybackend);
        model.addAttribute("judul","SEMUA KARYAWAN");


        return "karyawan/data-karyawan";
    }


}
