package com.company;


class NieprawidlowyAdresException extends Exception{
    public NieprawidlowyAdresException(String message) {
        super(message);
    }
}
public class Main {
    String Ulica, KodPocztowy, Miasto;
    int  NrDomu;
    public Main(String Ulica, String KodPocztowy, String Miasto, int NrDomu) throws NieprawidlowyAdresException
    {
        String blad = "";
        if(Ulica==null) blad+="Ulica nie moze byc null.";
        if(KodPocztowy==null) blad+="Kod Pocztowy nie moze byc null.";
        if(Miasto==null) blad+="Miasto nie moze byc null.";
        if(NrDomu<=0) blad+="Nr Domu nie moze byc mniejszy od zera.";
        if(!blad.equals("")) throw new NieprawidlowyAdresException(blad);

        this.Ulica = Ulica;
        this.KodPocztowy = KodPocztowy;
        this.Miasto = Miasto;
        this.NrDomu = NrDomu;
    }

    public static void main(String[] args) {
        try{
            Main Ob1 = new Main("Jasna",null,"Rzeszow",23);
        }
        catch (NieprawidlowyAdresException e){
            System.out.println(e.getMessage());
        }
    }
}
