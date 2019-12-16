package arrlist;

import java.util.*;

public class Collection {
    public static void arrList(){
        List<String> lscars = new ArrayList<String>();

        lscars.add("Volvo");
        lscars.add("BMW");
        lscars.add("Volvo");
        lscars.add("Mazda");
        lscars.add("Ford");
        lscars.add("Mazda");


        for (Iterator<String> iterator = lscars.iterator(); iterator.hasNext();){
            String nama = iterator.next();

            System.out.print("nama mobil = "+nama+"\n");
        }

    }

    public static void arrset(){
        Set<String> stcars = new HashSet<>();

        stcars.add("Volvo");
        stcars.add("BMW");
        stcars.add("Volvo");
        stcars.add("Mazda");
        stcars.add("Ford");
        stcars.add("Mazda");

        for (Iterator<String> iterator = stcars.iterator(); iterator.hasNext();){
            String nama = iterator.next();

            System.out.print("nama mobil = "+nama+"\n");
        }

    }

    public static void arrmap(){
        HashMap<Integer,String> mpcars = new HashMap<Integer, String>();
        mpcars.put(1,"Volvo");
        mpcars.put(2,"BMW");
        mpcars.put(3,"Volvo");
        mpcars.put(4,"Mazda");
        mpcars.put(5,"Ford");
        mpcars.put(6,"Mazda");

        System.out.println("Isi objek days: "+mpcars);
        System.out.println("mengambil = " +mpcars.get(4));
    }

    public static void arrLsAd(){
        List<String> lscars = new ArrayList<String>();
        List<String> lsmotor = new ArrayList<String>();

        lscars.add("Volvo");
        lscars.add("BMW");
        lscars.add("Volvo");
        lscars.add("Mazda");
        lscars.add("Ford");
        lscars.add("Mazda");

        lsmotor.add("kanzen");
        lsmotor.add("yamaha");
        lsmotor.addAll(lscars);

        for (Iterator<String> iterator = lsmotor.iterator(); iterator.hasNext();){
            String nama = iterator.next();

            System.out.print("nama mobil = "+nama+"\n");
        }

    }

    public static void arrLsAdRn(){
        List<String> lscars = new ArrayList<String>();
        List<String> lsmotor = new ArrayList<String>();

        lscars.add("Volvo");
        lscars.add("BMW");
        lscars.add("Mazda");
        lscars.add("Ford");

        lsmotor.add("Volvo");
        lsmotor.add("Mazda");
        lsmotor.retainAll(lscars);

        for (Iterator<String> iterator = lsmotor.iterator(); iterator.hasNext();){
            String nama = iterator.next();

            System.out.print("nama mobil = "+nama+"\n");
        }
    }

    public static void arrlsRmv(){
        List<String> lscars = new ArrayList<String>();

        lscars.add("Volvo");
        lscars.add("BMW");
        lscars.add("Mazda");
        lscars.add("Ford");

        List<String> lsmotor = new ArrayList<String>();
        lsmotor.add("Volvo");
        lsmotor.add("Mazda");
        lsmotor.add("becak");
        lsmotor.removeAll(lscars);

        for (Iterator<String> iterator = lsmotor.iterator(); iterator.hasNext();){
            String nama = iterator.next();

            System.out.print("nama mobil = "+nama+"\n");
        }
    }
}
