package com.example.jalan;

public class Array {
    public int[] createArray(){
        int[] s = new int[26];
        for (int i=0;i<26;i++){
            s[i] = i;
        }
        for (int i=0;i<26;i++) {
            System.out.println(s[i]);
        }
        return s;

    }

}
