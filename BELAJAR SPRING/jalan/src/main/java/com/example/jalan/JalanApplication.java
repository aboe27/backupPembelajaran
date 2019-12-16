package com.example.jalan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class JalanApplication {

	public static void main(String[] args) {
		SpringApplication.run(JalanApplication.class, args);

		array2Dimensi2();

		/*int[] nilai = {1,2,3,4,5,6};
			System.out.println("NILAI "+nilai[5]);*/

		/*------------------------------------------*/
		/*int[] nilai2 = new int[5];
		nilai2[0]=1;
		nilai2[1]=2;
		nilai2[2]=3;
		nilai2[3]=4;
		for (int i=0;i<5;i++){
			nilai2[i]=i;
		}
		for (int i=0;i<5;i++){
			System.out.println(nilai2[i]);
			String[] nama = {"lono","llani","lina","tono"};
			for(int j=0;j<3;j++) {
				System.out.println(nilai2[i] + nama[j]);
			}
		}*/
		/*-------------------------------------------------*/

		/*Array array = new Array();
		array.createArray();


		/*-------------------------------------*/
		/*
		Tugas tugas = new Tugas();
		tugas.dosen("oop");
		tugas.mhs(5,3,2);
		tugas.setPenilaian();
		tugas.kelas();*/
		/*--------------------------------------*/
		/*Alamat alamat = new Alamat();
		alamat.hitung();*/

		/*Bool bool = new Bool();
		bool.hasil(10,9);*/

		/*Luas luas = new Luas();
		luas.kubus();*/
		/*
		for(int i=0; i<=7; i++){
			for(int j =0; j<i;j++){
			System.out.printf("*");
			}
			System.out.println("");
		}
		*/

	}

	/*public static void testArray(){
		String[] buah = new  String[5];
		Scanner scanner = new Scanner(System.in);
		for(int i=0;i<buah.length;i++){
			System.out.println("buah ke : " +i+ ":");
			buah[i] = scanner.nextLine();
		}
		System.out.println(buah);
	}*/

	public static void array2Dimensi(){
		int[][] data = new int[0][0];
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.println(i+ " | " +j);
			}
		}
	}

	public static void array2Dimensi2(){
		String[][] contact={{"lili","0812"},{"sonya","0813"},{"rina","0813"}};
		for(int x=0; x<contact.length;x++){
			System.out.println(contact[x][0]);
			System.out.println(contact[x][1]);
			System.out.println("---------------------------");
		}
	}

}
