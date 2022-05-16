package com.company;

import java.lang.System;
import java.sql.SQLOutput;
import java.util.Random;
import java.util.SortedMap;

public class Main {

    public static void main(String[] args) {
       /* int[] tablica = {1, 23, 34};
        int[] tab1 = new int[4];
        tab1[0] = 12;
        tab1[1] = 23;
        tab1[2] = 34;
        tab1[3] = tab1[0] * tab1[2];

        for(int i=0; i< tab1.length; i++)
            System.out.println("Element tablicy nr: "+i+" = "+tab1[i]);
        System.out.println();
        for(int i: tab1)
            System.out.println(i+" ");
        int [][] macierz = new int[3][4];
        String [][][] data1=new String[2][4][4];

        int [][]a={{1,2,3},{4,5,3,5},{45}};
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++)
                System.out.println(a[i][j] + "\t");
            System.out.println();
        }
        System.out.println("for each");
        for(int []innerArray:a) {
            for (int data:innerArray) {
                System.out.print(data+ "\t");
            }
            System.out.println();
        }
    }

    int[]tabA ={1,2,3,4,34,45,56,76,32};
    int[]tabB = new int[9];
    int[]tabC = new int[tabA.length];

        for (int i = 0; i < tabA.length; i++)
            System.out.println(Arrays.toString(tabB));

        System.out.println("tabB = "+Arrays.toString(tabB));

        System.arraycopy(tabA,0,tabC,0,tabA.length);
        System.out.println("tabC = "+Arrays.toString(tabC));
        public static double zadanie1(){
        int []tab={1,2,3,4,5,6,7,8,9,0};
        int suma=0; double srednia=0;
        for (int i = 0; i < tab.length; i++)
            suma+=tab[i];
        srednia=(double)suma/(double)tab.length;
        System.out.println("Suma liczb z tablicy wynosi "+suma+ ", a srednia wartosci liczb z tablicy równa jest "+srednia);
        }
    boolean []tab = new boolean [20];
        for (int i = 0; i < tab.length/2; i++) {
            tab[2*i]=true;
            tab[2*i+1]=false;
        }
        for (int i = 0; i < tab.length; i++) {
            System.out.println("tab["+i"] = "+tab[i]);
        }
*/
        double[] tab = new double[20];
        System.out.println("elementy tablicy: ");
        for (int i = 0; i < tab.length; i++) {
            Random rand = new Random();
            tab[i] = rand.nextInt(45) - 10;
            System.out.println("tab[" + i + "] = " + tab[i]);
        }
        int suma = 0;
        double sumaR = 0;
        for (int i = 0; i < tab.length; i++)
            suma += tab[i];
        double srednia = (double) suma / (double) tab.length;
        System.out.println("Suma liczb z tablicy wynosi " + suma + ", a srednia wartosci liczb z tablicy równa jest " + srednia);
        for (int i = 0; i < tab.length; i++)
            sumaR = (tab[i] - srednia) * (tab[i] - srednia);
        System.out.println("Suma różnic wynosi " + sumaR);
        System.out.println("Warjacja wynosi " + sumaR / (double) ((tab.length) - 1));

    }

    public static double losuj() {
        Random rand = new Random();
        double liczba = rand.nextInt(45) - 10;
        return liczba;
    }
}
