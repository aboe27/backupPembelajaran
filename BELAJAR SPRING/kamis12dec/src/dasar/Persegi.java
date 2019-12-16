package dasar;

public class Persegi extends BangunDatar {
    float sisi;

    float luas(){
        float luas = sisi * sisi;
        System.out.println("luas persegi : "+luas);
        return luas;
    }

    float keliling(){
        float keliling = sisi *4;
        System.out.println("keliling : "+keliling);
        return keliling;
    }
}
