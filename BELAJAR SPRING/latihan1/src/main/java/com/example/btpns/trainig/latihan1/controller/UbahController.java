package com.example.btpns.trainig.latihan1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UbahController {
    @RequestMapping(value = "/ubah", method = RequestMethod.GET)
    public String rubahData(Model model){
        model.addAttribute("firstname","aboe");
        model.addAttribute("fullname","aboe ok ok");
        model.addAttribute("message", "yess berhasiil");
        return "data/data-diri";

    }

    @RequestMapping(value = "/listLooping")
    public String loopTest(Model model){
        String[] mhs = {"tono","tina","tena","tani"};
        List<String> listMhs = new ArrayList<String>();

        for(String maha :mhs){
            listMhs.add(maha);
        }

        model.addAttribute("univ","Daftar nama siswa prodi IT");
        model.addAttribute("listMahasiswa",listMhs);

        return "mahasiswa/list-mhs";
    }
}
