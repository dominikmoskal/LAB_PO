package com.company;

import jdk.swing.interop.SwingInterOpUtils;

public class Statek implements Lata, Plywa{
    @Override
    public void lec() {
        System.out.println("Statek nie lata.");
    }

    @Override
    public void plyn() {
        System.out.println("Statek plywa.");
    }
}
