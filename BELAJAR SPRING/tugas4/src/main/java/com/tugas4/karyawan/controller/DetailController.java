package com.tugas4.karyawan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.*;

@Controller
public class DetailController {
    @RequestMapping(value = "/karyawanDetail", method = RequestMethod.GET)
    public String kryDet(Model model){

        List<String> Karyawan = new ArrayList<String>();
        Karyawan karyawan = new Karyawan();
        karyawan.setId(1);
        karyawan.setNakar("Arif");
        karyawan.setNip(0101);
        karyawan.setBagian("backend");

        Karyawan karyawan1 = new Karyawan();
        karyawan1.setId(2);
        karyawan1.setNakar("misbah");
        karyawan1.setNip(0202);
        karyawan1.setBagian("backend");

        Karyawan karyawan2 = new Karyawan();
        karyawan2.setId(3);
        karyawan2.setNakar("cecep");
        karyawan2.setNip(0303);
        karyawan2.setBagian("backend");

        Karyawan karyawan3 = new Karyawan();
        karyawan3.setId(4);
        karyawan3.setNakar("gery");
        karyawan3.setNip(0404);
        karyawan3.setBagian("backend");

        Karyawan karyawan4 = new Karyawan();
        karyawan4.setId(4);
        karyawan4.setNakar("karim");
        karyawan4.setNip(0505);
        karyawan4.setBagian("backend");

        List<Karyawan> karyawans =new ArrayList<>();
        karyawans.add(karyawan);
        karyawans.add(karyawan1);
        karyawans.add(karyawan2);
        karyawans.add(karyawan3);
        karyawans.add(karyawan4);

        HashMap<String, Karyawan> tes = new HashMap<String, Karyawan>();
        for (Karyawan kry2 : karyawans){
            tes.put(kry2.getBagian(),kry2);
                if (kry2.getBagian().equals("backend")){
                    Karyawan kry = tes.get("backend");
                    model.addAttribute("krynama",kry.getNakar());
                }

        }

        return "karyawan/karyawanDetail";
    }
}
