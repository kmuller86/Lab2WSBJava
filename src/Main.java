import java.util.Scanner;

public class Main {

    private static int[] tablica;

    public static void main(String[] args) {



        /* ćwiczenie 3 switch case */

        /* zad.1 napisać program który przyjmuje jedną liczbę od użytkownika z klawiatury
          i za pomocą switch case default ma określić czy:
          a) ta liczba jest parzysta --> podpowiedz switch(a % 2) {
          b) program który określi czy liczba jest podzielna przez 7
         */

        Scanner zmiennaDoPobiraniaDanych = new Scanner(System.in);
        System.out.println("Podaj dowolna liczbe");
        int liczba = zmiennaDoPobiraniaDanych.nextInt();
        System.out.println("Podana liczba = " + liczba);
        switch (liczba%2) {
            case 0:
                System.out.println("liczba " +liczba+ " podzielna przez 2");
                break;

                default:
                System.out.println("liczba " +liczba+ " nie podzielna przez 2");

        }

        switch (liczba%7) {
            case 0:
                System.out.println("liczba " +liczba+ " podzielna przez 7");
                break;

            default:
                System.out.println("liczba " +liczba+ " nie podzielna przez 7");

        }





        /* zad.2
           a) napisać program podobny do programu z przykładu, który ma zliczyć iloś liter 'o', 'p', 'x', 'z', 'q' w wyrazie:
            "ooooozjoonoxoooozoooooooooozoxooooopnpppoooiiooooomnzooooxoqoojoozoootyoooozoooxoooozooooxooooooojoooopxoooonnmooo"
           b) oraz ma określić ile jest pozostałych liter, które nie należą do: 'o', 'p', 'x', 'z', 'q'
         */

        String text = "ooooozjoonoxoooozoooooooooozoxooooopnpppoooiiooooomnzooooxoqoojoozoootyoooozoooxoooozooooxooooooojoooopxoooonnmooo";
        int[] tablicaDoKalkulacji = new int [6];
        for (char zmiennaChar : text.toCharArray()) {
            switch (zmiennaChar) {
                case 'o':
                    ++tablicaDoKalkulacji[0];
                    break;
                case 'p':
                    ++tablicaDoKalkulacji[1];
                    break;
                case 'x':
                    ++tablicaDoKalkulacji[2];
                    break;
                case 'z':
                    ++tablicaDoKalkulacji[3];
                    break;
                case 'q':
                    ++tablicaDoKalkulacji[4];
                    break;
                default:
                    ++tablicaDoKalkulacji[5];

            }
        }
        System.out.println("w słowie ooooozjoonoxoooozoooooooooozoxooooopnpppoooiiooooomnzooooxoqoojoozoootyoooozoooxoooozooooxooooooojoooopxoooonnmooo: ");
        System.out.println("ilość liter o = " + tablicaDoKalkulacji[0]);
        System.out.println("ilość liter p = " + tablicaDoKalkulacji[1]);
        System.out.println("ilość liter x = " + tablicaDoKalkulacji[2]);
        System.out.println("ilość liter z = " + tablicaDoKalkulacji[3]);
        System.out.println("ilość liter q = " + tablicaDoKalkulacji[4]);
        System.out.println("ilość innych liter = " + tablicaDoKalkulacji[5]);







    }
}
