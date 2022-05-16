package com.company;

public class Main {

    public static void main(String[] args) {
        Statek S1 = new Statek();
        S1.plyn();
        S1.lec();
        System.out.println();
        Samolot s1 = new Samolot();
        s1.lec();
        s1.plyn();
        System.out.println();
        Wieloryb W1 = new Wieloryb();
        System.out.println(W1.name);
        W1.zanurz();
        W1.plyn();
        W1.wynurz();
        Cat cat = new Garfield();
        Lasagnaeater lasagnaeater = new Garfield();
        FatCat fatCat = new Garfield();
        Garfield garfield = new Garfield();
    }
}
