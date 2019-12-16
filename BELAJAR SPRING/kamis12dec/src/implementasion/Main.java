package implementasion;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private Mobil kend;

    public static void main(String[] args) {
        Main main = new Main();
        main.getImpl();
    }

    public void getImpl(){
        List<Kendaraan> kendaraan = new ArrayList<Kendaraan>();
        kendaraan.add(new Mobil());
        for (Kendaraan kendaraan1:kendaraan){
            kendaraan1.jenis("aya");
        }
    }
}
