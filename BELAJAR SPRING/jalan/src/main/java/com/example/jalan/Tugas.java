package com.example.jalan;

public class Tugas {
    int rumus1;
    int rumus2;
    int sks;
    int nilai;
    int hasil;
    String matkul;


    public void dosen(String matkul) {
        this.matkul = matkul;
    }

    public void mhs(int rumus1, int rumus2, int nilai) {
        this.rumus1 = rumus1;
        this.rumus2 = rumus2;
        this.nilai = nilai;
        this.matkul = matkul;
    }

    public void setPenilaian(){
        switch (matkul){
            case "mtk":
                sks = 1 ;
                break;
            case  "oop":
                sks = 2 ;
                break;
            case  "css":
                sks = 1 ;
                break;
        }
        if(sks==1){
            hasil = nilai * rumus1;
        }if(sks==2){
            hasil = nilai * rumus2;
        }

    }
    public void kelas(){
        System.out.println("nama : arif budiman");
        System.out.println("matkul : "+matkul);
        System.out.println("sks : "+sks);
        System.out.println("hasil ujian : " +hasil);

    }

}