package com.a;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //array3Dimensi();
        array2Dimensi();

    }
    public static void array3Dimensi() {
        int[][][] data = new int[0][0][0];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                for (int k=0;k<3;k++){
                    System.out.println(i+ " | " +j+" | "+k);
                }
            }
        }

    }
    public static void array2Dimensi(){
        String[][] data = new String[2][3];
        Scanner scanner = new Scanner(System.in);

        for (int i=0;i<data.length;i++){
            for (int j=0;j<data.length;j++){
                System.out.printf("baris :"+i+"kolom: "+j+"\n");
                data[i][j]=scanner.nextLine();
            }
        }

        for (int i=0;i<data.length;i++){
            for(int j=0;j<data.length;j++){
                System.out.printf(data[i][j]+" | ");
            }
            System.out.println("");
        }

    }
}
