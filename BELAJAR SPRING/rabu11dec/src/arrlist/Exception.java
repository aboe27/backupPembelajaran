package arrlist;

import java.util.Scanner;

//fungsi untuk tetap mengeksekusi prgram walaupun ada error
public class Exception {
    public static void tes(){
        try {
            String a= null;
            System.out.println(a.length());
        } catch (java.lang.Exception kesalahan){
            kesalahan.printStackTrace();
        }
        System.out.println("lanjuut");
    }
    public static void tes2(){
        Scanner input = new Scanner(System.in);
        int bebek;
        System.out.print("bawakan 2 ekor bebek");
        try{
            System.out.print("jumlah bebek yg ingin di bawa : ");
            bebek = input.nextInt();
            if (bebek > 2){
                throw new java.lang.Exception("terjadi kesalahan");
            }else {
                System.out.println("aman aman saja");
            }
        }catch (java.lang.Exception e){
            e.printStackTrace();
        }
        System.out.println("ok");
    }

}
