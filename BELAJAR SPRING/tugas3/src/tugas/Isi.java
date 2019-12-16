package tugas;

import java.util.*;

public class Isi {
    public static void set(){
        //try{
            Set<Karyawan> data = new HashSet<>();
            Set<Karyawan> data1 = new HashSet<>();
            Karyawan karyawan1= new Karyawan();
            karyawan1.setId(1);
            karyawan1.setNakar("bana");
            karyawan1.setNip(0101);
            karyawan1.setJabatan("manager");
            karyawan1.setStatus("aktif");

            Karyawan karyawan2= new Karyawan();
            karyawan2.setId(1);
            karyawan2.setNakar("bana");
            karyawan2.setNip(0101);
            karyawan2.setJabatan("manager");
            karyawan2.setStatus("aktif");

            Karyawan karyawan3= new Karyawan();
            karyawan3.setId(2);
            karyawan3.setNakar("bini");
            karyawan3.setNip(0202);
            karyawan3.setJabatan("magang");
            karyawan3.setStatus("aktif");

            Karyawan karyawan4= new Karyawan();
            karyawan4.setId(3);
            karyawan4.setNakar(null);
            karyawan4.setNip(0303);
            karyawan4.setJabatan("staff");
            karyawan4.setStatus("aktif");

            Karyawan karyawan5= new Karyawan();
            karyawan5.setId(4);
            karyawan5.setNakar("bene");
            karyawan5.setNip(0404);
            karyawan5.setJabatan("supv");
            karyawan5.setStatus("aktif");

            Karyawan karyawan6= new Karyawan();
            karyawan6.setId(5);
            karyawan6.setNakar("bono");
            karyawan6.setNip(0505);
            karyawan6.setJabatan("direksi");
            karyawan6.setStatus("aktif");

            Karyawan karyawan7= new Karyawan();
            karyawan7.setId(6);
            karyawan7.setNakar("bunui");
            karyawan7.setNip(0606);
            karyawan7.setJabatan("kepala");
            karyawan7.setStatus("aktif");


            data.add(karyawan1);
            data1.add(karyawan2);
            data.add(karyawan3);
            data.add(karyawan4);
            data.add(karyawan5);
            data.add(karyawan7);
            data.add(karyawan6);
            data1.addAll(data);
            data1.retainAll(data);

/*
            for (Karyawan obj : data){

            try {
                if(obj.getNakar()==null){
                    throw new Exception("jangan null laah");
                }else {
                    System.out.println(obj.getId());
                    System.out.println(obj.getNakar());
                    System.out.println(obj.getJabatan());
                    System.out.println(obj.getNip());

                }
            }catch (Exception e){
                e.printStackTrace();
            }
                System.out.println("----------------");
            }

 */



                HashMap<String, Karyawan> tes = new HashMap<String, Karyawan>();
                for (Karyawan kry : data) {
                    try {
                    tes.put(kry.getStatus(),kry);
                    if (kry.getNakar().equals(null)){
                        throw new  Exception("data Salah");
                    }else if(kry.getStatus().equals("aktif")){
                        Karyawan kry1 = tes.get("aktif");

                        System.out.println("id = "+kry1.getId()+", nama = "+kry1.getNakar()+
                                ", nip = "+kry .getNip()+", jabatan = "+kry.getJabatan());
                    }
                }

            catch (Exception e){
                System.err.println("data tidak boleh null di ID: "+kry.getId());
                e.printStackTrace();;
            }

    }

}

}
