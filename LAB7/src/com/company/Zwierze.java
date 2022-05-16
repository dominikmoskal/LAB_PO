package com.company;

public abstract class Zwierze   implements Plywanie, Latanie {
    @Override
    public void lec() {
        System.out.println("Lece");
    }

    @Override
    public void wyladuj() {
        System.out.println("Laduje");
    }

    @Override
    public void plyn() {
        System.out.println("Plyne");
    }

    @Override
    public void wynurz() {
        System.out.println("Wynurzam sie");
    }

    @Override
    public void zanurz() {
        System.out.println("Zanurzam sie");
    }
}
