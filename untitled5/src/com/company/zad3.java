package com.company;

import java.util.Scanner;

public class zad3 {
    public static void main() {
        double suma_par = 0, liczba;
        int ile_d = 0, ile_u = 0;

        for (int i = 0; i < 10; i++) {
            liczba = wczytaj();
            if (liczba % 2 == 0) suma_par += liczba;
        }

        System.out.println("Suma liczba parzystych: " + suma_par);
    }
    public static double wczytaj() {
        Scanner input = new Scanner(System.in);
        System.out.print("Podaj liczbe: ");
        double n=input.nextDouble();
        return n;
    }

}
