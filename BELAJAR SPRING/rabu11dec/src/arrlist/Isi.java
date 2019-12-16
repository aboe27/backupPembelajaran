package arrlist;

import java.util.*;

public class Isi {
    public static void arrset() {
        List<String> Makan = new ArrayList<String>();
        Makan makan1 = new Makan();
        makan1.setId(1);
        makan1.setNama("bakso");
        makan1.setJumlah(1);
        makan1.setJenis("kering");
        makan1.setHarga(5000);

        Makan makan2 = new Makan();
        makan2.setId(2);
        makan2.setNama("wkwkwk");
        makan2.setJumlah(2);
        makan2.setJenis("berkuah");
        makan2.setHarga(7000);

        Makan makan3 = new Makan();
        makan3.setId(3);
        makan3.setNama("wkwkwkh");
        makan3.setJumlah(2);
        makan3.setJenis("berkuah");
        makan3.setHarga(7000);

        List<Makan> makan = new ArrayList<Makan>();
        makan.add(makan1);
        makan.add(makan2);
        makan.add(makan3);

        HashMap<String, Makan> tes = new HashMap<String, Makan>();
        for (Makan mkn2 : makan) {
            tes.put(mkn2.getJenis(),mkn2);
            if(mkn2.getJenis().equals("berkuah")){
                Makan mkn = tes.get("berkuah");
                System.out.println("panggil maps : "+tes.get("berkuah").getNama());
                System.out.println("id = "+mkn.getId()+", nama = "+mkn.getNama()+", harga = "+mkn.getHarga());
            }
        }

    }

}
