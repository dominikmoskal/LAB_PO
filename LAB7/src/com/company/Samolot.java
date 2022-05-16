package com.company;

public class Samolot implements Lata, Plywa{
    @Override
    public void lec() {
        System.out.println("Samolot lata.");
    }

    @Override
    public void plyn() {
        System.out.println("Samolot nie plywa.");
    }
}
