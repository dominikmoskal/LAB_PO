package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Podaj liczbe: ");
        Scanner scan = new Scanner(System.in);
        double liczba;
        while(true)
        {
            try
            {
                liczba = scan.nextDouble();
                break;
            }
            catch (InputMismatchException e)
            {
                System.out.println("Wybrany znak nie jest liczba.");
                System.out.print("Podaj poprawną liczbę: ");
                scan.next();
            }
        }
            if (liczba < 0)
                throw new IllegalArgumentException("Pierwiastek kwadratowy z liczby rzeczywistej "+liczba+" nie istnieje");
            else
                System.out.println("Pierwiastek z "+liczba+" to "+Math.sqrt(liczba));
                System.out.println(String.format("Pierwiastek z %.4f to %.4f",liczba,Math.sqrt(liczba)));

    }
}



















/*

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        System.out.println("Podaj liczbe: ");
        Scanner sc = new Scanner(System.in);

        double liczba;
        while(true) {
            try {
                liczba = sc.nextDouble();
                break;
            } catch (InputMismatchException var5) {
                System.out.println("Podaj poprawną liczbę");
                sc.next();
            }
        }

        if (liczba < 0.0D) {
            throw new IllegalArgumentException(String.format("Pierwiastek kwadratowy z liczby rzeczywistej %.4f nie istnieje", liczba));
        } else {
            System.out.println(String.format("Pierwiastek z %.4f to %.4f", liczba, Math.sqrt(liczba)));
        }
    }
}
*/
