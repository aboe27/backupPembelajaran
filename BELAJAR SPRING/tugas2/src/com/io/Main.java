package com.io;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.BufferedOutputStream;
import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)throws Exception{
        //write();
        //read();
        //bufferedOutStrm();
        //bufferedInStrm();
        //scan();
        bufferedOutStrmArr();
        //fileWrite();


    }
    public static void write(){
        try{
            FileOutputStream fout= new FileOutputStream("C:\\Users\\btpnsshifted\\Documents\\testout.txt");
            String s="welcome aboe tes";
            byte b[]= s.getBytes();
            fout.write(b);
            fout.close();
            System.out.println("sucses");

        }catch (Exception e){System.out.println(e);}
    }
    public static void read(){
        try {
            FileInputStream fin = new FileInputStream("C:\\Users\\btpnsshifted\\Documents\\testout.txt");
            int i=0;
            while ((i=fin.read())!=-1){
                System.out.print((char)i);
            }
            fin.close();
        }catch (Exception e){System.out.println(e);}
    }
    public static void bufferedOutStrm()throws Exception{
        FileOutputStream fout = new FileOutputStream("C:\\Users\\btpnsshifted\\Documents\\testout.txt");
        BufferedOutputStream bout = new BufferedOutputStream(fout);
        Scanner scanner = new Scanner(System.in);
        System.out.print("masukan data yg ingin di simpan: ");
        String data = scanner.nextLine();
        byte b[]=data.getBytes();
        bout.write(b);
        bout.flush();
        bout.close();
        fout.close();
        System.out.println("succes");
    }

    public static void bufferedInStrm(){
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

    public static void bufferedOutStrmArr()throws Exception{
        String[][] datai = new String[2][3];
        Scanner input = new Scanner(System.in);
        FileOutputStream fout = new FileOutputStream("C:\\Users\\btpnsshifted\\Documents\\testout.txt");
        BufferedOutputStream bout = new BufferedOutputStream(fout);

        for (int i=0;i<datai.length;i++){
            for (int j=0;j<datai.length;j++){
                System.out.printf("baris "+i+":, "+"kolom "+j+": "+"\n");
                datai[i][j]=input.nextLine();
                String coment = " | ";
                byte b[]=datai[i][j].getBytes();
                byte c[]=coment.getBytes();
                bout.write(b);
                bout.write(c);
                bout.flush();
            }
        }
        try {
            for (int i=0;i<datai.length;i++){
                for(int j=0;j<datai.length;j++){
                    bout.close();
                    fout.close();
                }
                System.out.println("");

            }System.out.println("succes");

        }catch (Exception e){}

    }

    public static void fileWrite() throws Exception{
        String[][] datai = new String[2][3];
        Scanner scanner = new Scanner(System.in);

        File data = new File("C:\\Users\\btpnsshifted\\Documents\\testout.txt");
        PrintWriter wr = new PrintWriter(new FileWriter(data,false));

        for (int i=0;i<datai.length;i++){
            for (int j=0;j<datai.length;j++){
                System.out.printf("baris :"+i+"kolom: "+j+"\n");
                datai[i][j]=scanner.nextLine();
            }
        }
        try {

            for (int i=0;i<datai.length;i++){
                for(int j=0;j<datai.length;j++){
                    wr.printf(datai[i][j]+" | ");
                }
                System.out.println("");
            }wr.close();
            System.out.println("succes");

        }catch (Exception e){}
    }

}
