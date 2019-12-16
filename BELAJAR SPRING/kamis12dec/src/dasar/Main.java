package dasar;

public class Main {
    public static void main(String[] args) {
        BangunDatar bangunDatar = new BangunDatar();

        Persegi persegi = new Persegi();
        persegi.sisi = 2;

        PersegiPanjang persegiPanjang = new PersegiPanjang();
        persegiPanjang.lebar = 3;
        persegiPanjang.panjang = 4;

        SegiTiga segiTiga = new SegiTiga();
        segiTiga.alas = 5;
        segiTiga.tinggi=6;

        Lingkaran lingkaran = new Lingkaran();
        lingkaran.r = 22;

        bangunDatar.luas();
        bangunDatar.keliling();

        persegi.luas();
        persegi.keliling();

        persegiPanjang.luas();
        persegiPanjang.keliling();

        segiTiga.luas();
        segiTiga.keliling();

        lingkaran.luas();
        lingkaran.keliling();


    }
}
