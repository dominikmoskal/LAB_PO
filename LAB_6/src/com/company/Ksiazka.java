package com.company;

public class Ksiazka {
    Osoba autor;
    String tytul;
    double cena;

    public Ksiazka(Osoba autor, String tytul, int i, double cena) {
        this.autor = autor;
        this.tytul = tytul;
        this.cena = cena;
    }

    public Osoba getAutor() {
        return autor;
    }

    public String getTytul() {
        return tytul;
    }

    public double getCena() {
        return cena;
    }


}
