package com.company;

public class Pracownik {
    String imie, nazwisko;
    int wyplata;

public Pracownik() {
        imie = " ";
        nazwisko = " ";
        wyplata = 0;
    }

    public Pracownik(String imie, String nazwisko, int wyplata) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wyplata = wyplata;
    }

    public void Wypisz(){
        System.out.println("Jestem pracownikiem, moje dane: \tImie: "+imie+" \tNazwisko: "+nazwisko+" \tWyplata: "+wyplata);
    }
}

