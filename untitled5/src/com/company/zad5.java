package com.company;

public class zad5 {
    public static void main(String[] args) {

    }

    public static boolean Palindrom(String tekst) {
        for (int i=0; i<tekst.length()/2;i++){
            char znak = tekst.charAt(i);
            char przeciwnyZnak = tekst.charAt(tekst.length()-1-i);

            if(znak !=przeciwnyZnak) return false;
        }
        return true;
    }


}
