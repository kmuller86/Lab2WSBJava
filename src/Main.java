import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        /* ćw.2 pętle for */

        /* zad.1 Napisz program który będzie iterował od 100 do 0,
         *  i wyświetlał liczby które są podzielne przez ostatnią cyfrę waszego indeksu
         * (jesli tą liczbą jest 0 to przez 2 ostatnie) */

        int numerIndexu = 8;

        for (int zmiennaDoPentli = 100; zmiennaDoPentli >= 0; zmiennaDoPentli-- )
        { if (zmiennaDoPentli%numerIndexu ==0 ){
            System.out.println(zmiennaDoPentli);}
        }




        /* zad.2 Napisz program który będzie uzupełniał tablicę 5-cio elementową int[] liczbami
         * wprowadzanymi z klawiatury (użyć klasy Scanner), a następnie będzie wyświetlał elementy tablicy
         * za pomocą pętli forEach powiększone o 11 */


        int[] tablicaDoCzwiczenia = new int[5];
        int zmiennaWprowadzoneDane;

        Scanner zmiennaWprowadzaniadanych = new Scanner(System.in);

        for (int y = 0; y <= tablicaDoCzwiczenia.length - 1; y++)

        {
            System.out.println( "prosze podac liczbe do konteneru: ");
            tablicaDoCzwiczenia [y] = zmiennaWprowadzaniadanych.nextInt()*11;

            System.out.println( "Kontener " + y + " = " + tablicaDoCzwiczenia [y]);
        }

        System.out.println("......");
        int z = 0;
        while (z <= tablicaDoCzwiczenia.length-1) {
            System.out.println(tablicaDoCzwiczenia[z]);
            z++;
        }



    }
}
