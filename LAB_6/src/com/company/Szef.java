package com.company;
public class Szef extends Pracownik{
    int premia;

    public Szef(String imie, String nazwisko, int wyplata, int premia) {
        super(imie, nazwisko, wyplata);
        this.premia = premia;
    }

    public Szef(){

    }
    public void Wypisz(){
        super.Wypisz();
        System.out.println("Ponadto mam premie: "+premia);
    }

}
