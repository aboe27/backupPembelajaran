package dasar;

public class SegiTiga extends BangunDatar {
    float alas;
    float tinggi;

    float luas() {
        float luas = alas * tinggi;
        System.out.println("luas persegi : " + luas);
        return luas;
    }
}


