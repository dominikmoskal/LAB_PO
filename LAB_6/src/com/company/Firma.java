package com.company;

public class Firma {
    public static void main(String args[]){

        Pracownik prac = new Pracownik("Wlodek", "Zięba", 3000);
        System.out.println("Imię: "+prac.imie);
        System.out.println("Nazwisko: "+prac.nazwisko);
        System.out.println("Wypłata: "+prac.wyplata+"\n");

        //najpierw stwórzmy obiekt klasy Szef korzystając z domyślnego konstruktora
        Szef szef = new Szef("Jan","Kowalki",12345,1);

        prac.Wypisz();
        szef.Wypisz();

        //zobaczmy jak wyglądają odpowiednie pola
        System.out.println("Imię: "+szef.imie);
        System.out.println("Nazwisko: "+szef.nazwisko);
        System.out.println("Wypłata: "+szef.wyplata);
        System.out.println("Premia: "+szef.premia+"\n");

        //teraz ustawiamy dane szefa
        szef.imie = "Tadeusz";
        szef.nazwisko = "Kowalski";
        szef.wyplata = 10000;
        szef.premia = 2000;
        System.out.println("Imię: "+szef.imie);
        System.out.println("Nazwisko: "+szef.nazwisko);
        System.out.println("Wypłata: "+szef.wyplata);
        System.out.println("Premia: "+szef.premia);

        //rzutowanie w górę
        Szef kierownik = new Szef();
        Pracownik prac = (Szef) kierownik; // rzutowanie w górę Szef -> Pracownik

        //rzutowanie w dół
        Pracownik pra1 = (Pracownik) new Szef();
        if(pra1 instanceof Szef){   //spr przed rzutowaniem
            Szef szef = (Szef) pra1;    //rzutowanie w dol pracownik na szef
        }

    }

}
