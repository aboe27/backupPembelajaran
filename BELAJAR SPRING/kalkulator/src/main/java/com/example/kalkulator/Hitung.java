package com.example.kalkulator;

public class Hitung {
    int angka1 ;
    int angka2 ;
    int hasil = 0;
    double val ;

    public int getAngka1() {
        return angka1;
    }

    public void setAngka1(int angka1) {
        this.angka1 = angka1;
    }

    public int getAngka2() {
        return angka2;
    }

    public void setAngka2(int angka2) {
        this.angka2 = angka2;
    }

    public void setHasil(int hasil) {
        this.hasil = hasil;
    }

    public float getHasil() {
        return hasil;
    }

    public void tambah(){
        hasil=angka1+angka2;
        System.out.println("hasil tambah " +hasil);
    }

    public void kali(){

        hasil=angka1*angka2;
        System.out.println("hasil tambah " +hasil);
    }

    public void bagi(){
        val=Double.parseDouble(angka1+"") / Double.parseDouble(angka2+"");
        System.out.println("hasil bagi"+val);
    }

    public void kurang(){
        hasil=angka1-angka2;
        System.out.println(+hasil);
    }
}
