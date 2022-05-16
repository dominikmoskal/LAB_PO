package com.company;

import java.util.Scanner;

public class zad1 {
    public static void main() {
        double lp = wczytaj(),suma=0,srednia=0,temp=lp;
        Scanner input = new Scanner(System.in);
        while(lp>0){
            System.out.println("Podaj punkty studenta: ");
            double d = input.nextDouble();
            suma= suma +d;
            lp--;
        }
        srednia = suma/lp;
        System.out.println(srednia);
    }

    public static double wczytaj() {
        Scanner input = new Scanner(System.in);
        System.out.print("Podaj liczbe: ");
        double n=input.nextDouble();
        return n;
    }

}

