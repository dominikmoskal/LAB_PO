package com.company;

public class Main {

    public static void main(String args[]) {
        Pal();
    }

    public static boolean Pal(String tekst){
     int tak;
     for (int i = 0; i < tekst.length()/2; i++)
     {
        if(tekst.charAt(i)==tekst.charAt(tekst.length()-1-i))
            tak++;
     }
     if(tak==tekst.length()/2)
         System.out.println("Slowo "+tekst +" jest Palindromem");
     else
         System.out.println("Slowo "+tekst +" nie jest Palindromem");
 }
}
