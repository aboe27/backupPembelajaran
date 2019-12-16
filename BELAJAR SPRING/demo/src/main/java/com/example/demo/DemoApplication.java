package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		Bicycle bicycle;
		bicycle = new Bicycle();
		bicycle.changeCadence(9);

		System.out.println(bicycle.getCadence());

		Nasabah nasabah;
		nasabah = new Nasabah();
		nasabah.setNama("arif budiaman");
		nasabah.setAlamat("buaran");
		nasabah.setUmur(22);
		nasabah.setPassword("123");
		nasabah.setAktif(Boolean.TRUE);
		nasabah.setSaldo(0.0);
		nasabah.setToken("");
		System.out.println(nasabah.getNama());
		System.out.println(nasabah.getAlamat());
		System.out.println(nasabah.getUmur());
		System.out.println(nasabah.getPassword());
		System.out.println(nasabah.getAktif());
		System.out.println(nasabah.getSaldo());
		System.out.println(nasabah.getToken());

		nasabah.promo();
		System.out.println(nasabah.getSaldo());
		System.out.println("tes 2");

	}

}
