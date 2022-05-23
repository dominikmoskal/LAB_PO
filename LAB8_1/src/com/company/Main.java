package com.company;


class BlednaWartoscDlaSilniException extends Exception{
    public BlednaWartoscDlaSilniException(String message) {
        super(message);
    }
}
public class Main {

    public static void main(String[] args) {
    try{
        System.out.println(String.format("5! = %d",Silnia(5)));
        System.out.println(String.format("2! = %d",Silnia(2)));
        System.out.println(String.format("-3! = %d",Silnia(-3)));
    }
    catch (BlednaWartoscDlaSilniException e){
       System.out.println(String.format("Blad => %s",e.getMessage()));
    }
    }

    public static int Silnia (int n) throws BlednaWartoscDlaSilniException {
        if(n<0)
            throw new BlednaWartoscDlaSilniException("nie istnieje silnia z liczby ujemnej");
        int wynik=1;
        for (int i = 2; i <= n; i++) {
            wynik*=i;
        }
        return wynik;

    }
}
