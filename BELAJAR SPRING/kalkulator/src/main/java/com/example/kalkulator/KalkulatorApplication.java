package com.example.kalkulator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KalkulatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(KalkulatorApplication.class, args);
		Pengguna pengguna;
		pengguna = new Pengguna();
		pengguna.setNama("surya");
		System.out.println(pengguna.getNama());
		Hitung hitung;
		hitung = new Hitung();
		hitung.setAngka1(4);
		hitung.setAngka2(8);
		System.out.println("angka 1 = " +hitung.getAngka1());
		System.out.println("angka 2 = " +hitung.getAngka2());
		hitung.tambah();
		hitung.kali();
		hitung.bagi();
		hitung.kurang();
	}

}
