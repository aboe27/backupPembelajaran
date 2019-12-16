package com.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class Panggil {
    public static void main(String[] args)throws Exception{
        bufferedInStrmArr();
    }
    public static void bufferedInStrmArr(){
        try {
            FileInputStream fin = new FileInputStream("C:\\Users\\btpnsshifted\\Documents\\testout.txt");
            BufferedInputStream bin = new BufferedInputStream(fin);
            int i;
            while ((i=fin.read())!=-1){
                System.out.print((char)i);
            }
            bin.close();
            fin.close();
        }catch (Exception e){System.out.println(e); }
    }

}
