package com.company;

import java.util.Scanner;

public class zad2 {
    public static void main() {
        double suma_d=0, suma_u=0, liczba;
        int ile_d=0, ile_u=0;

        for (int i = 0; i < 10; i++){
            liczba = wczytaj();
            if(liczba>=0){
                ile_d++; suma_d+=liczba;
            }else {
                ile_u++; suma_u+=liczba;
            }
        }
        System.out.println("Suma liczba dodatnich: "+suma_d+ ", ilosc liczba dodatnich "+ile_d);
        System.out.println("Suma liczba ujemnych: "+suma_u+ ", ilosc liczba ujemnych "+ile_u);
    }
    public static double wczytaj() {
        Scanner input = new Scanner(System.in);
        System.out.print("Podaj liczbe: ");
        double n=input.nextDouble();
        return n;
    }

}