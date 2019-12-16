package dasar;

public class PersegiPanjang extends BangunDatar {
    float panjang;
    float lebar;

    float luas(){
        float luas = panjang * lebar;
        System.out.println("luas persegi : "+luas);
        return luas;
    }

    float keliling(){
        float keliling = 2*panjang + 2*lebar;
        System.out.println("keliling : "+keliling);
        return keliling;
    }
}
