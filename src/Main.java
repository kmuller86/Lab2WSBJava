public class Main {

    public static void main(String[] args) {

        /* cw.1 pętle while */

        /* zad 1 - Napisać za pomocą pętli do-while kod który będzie iterował od liczby 1000 w dół do 0.
          Jeśli liczba będzie podzielna przez 2 ostatnie cyfry waszego indexu (podać nr indexu)
          to dać komunikat "liczba XX podzielna przez YY" (XX-liczba podzielna YY-podzielnik)
        */

        int zmiennaNrIndexu = 8;
        System.out.println("Ostatni Nr Indexu: " + zmiennaNrIndexu);
        for (int i = 100; i >= 0; i--) {

            if (i % zmiennaNrIndexu == 0) {
                System.out.println("liczba i: " + i + " podzelna przez NrIndexu:"
                        + zmiennaNrIndexu);

        /* zad 2
        a) stworzyć tablicę typu int wielkosci 5, przypisac jej dowolne wartości,
          przeiterować tablicę po elementach i wyswietlić, użyć pętli while
        b) jak wyżej tylko dla tablicy typu double[],
        c) jak wyżej dla tablicy String[], przeiterować i wyświetlić od ostatniego elementu
        */
//tablica typu int
                int[] tab = new int[5];

                tab[0] = 123213;
                tab[1] = 890;
                tab[2] = 993492;
                tab[3] = 8901234;
                tab[4] = 5230948;

                System.out.println("Dlugosc tablicy typu int: " + tab.length + " elementow");

                for (int x = 0; x <= tab.length - 1; x++) {
                    System.out.println(tab[x]);

                }

                // tablica typu double

                double[] tabDouble = new double[5];

                tabDouble[0] = 99.9;
                tabDouble[1] = 14341.1234312;
                tabDouble[2] = 6366.5458349583495;
                tabDouble[3] = 890.54378423;
                tabDouble[4] = 43432.86868;
                System.out.println("....................");
                System.out.println("Dlugosc tablicy typu String: " + tab.length + " elementow");

                for (int z = 0; z <= tabDouble.length - 1; z++) {
                    System.out.println(tabDouble[z]);

                }
                // tablica typu String

                String[] tabString = new String[5];

                tabString[0] = "Samsung";
                tabString[1] = "Apple";
                tabString[2] = "LG";
                tabString[3] = "Asus";
                tabString[4] = "Xiaomi";
                System.out.println("....................");
                System.out.println("Dlugosc tablicy typu String: " + tab.length + " elementow");

                for (int v = 0; v <= tabString.length - 1; v++) {
                    System.out.println(tabString[v]);
                }
        /* zad.3
        a) sprawdzić jak zachowuje się pętla while gdy w jej warunku damy true --> while(true)
        b) a jak gdy damy false --> while(false)
        */
                    while (true) {
                    } //pętla nieskonczona


                    /* while (false) {
                    } // bląd kompilacji
                       */

                }
            }
        }
    }






