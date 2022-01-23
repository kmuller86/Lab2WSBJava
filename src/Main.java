import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;



public class Main {

    public static void main(String[] args) {

        /* ćw_6 Listy */

        /* zad.1 a) Napisać program który stworzy listę ArrayList<String> (lista tablicowa),
                Proszę dane wprowadzać z klawiatury (można użyć pętli), lista ma mieć przynajmniej 5
                elementów i elementami mają być nazwy zwierząt.
                b) proszę stworzyć metodę która będzie miała pętle forEach i będzie wyświetlała elementy Listy
                -- podpowiedź: for(String zmienna : List<String>)
                c) proszę usunąć 2 ostatnie elementy listy i dodać do niej 3 inne elementy,
                następnie wyświetlić listę i wielkość listy,
                d) następnie proszę wykonać odwrotne sortowanie i znów użyć metody z punktu b) do wyświetlenia
                elementów listy\
                */

        /* lepszym rozwiązaniem jest deklarowanie interfejsem, wtedy można inicjować różnymi typami klas, nawet po przypisaniu już danych,
           polecam tak tworzyć listy/sety mapy : List<String> = new ArrayList<>(), Set<Typ> = new SetTree<>(), Map<Integer, String> = new HashMap<>();
           List, Set, Map - to interfejsy, warto o tym poczytać
        */
         ArrayList <String>animalsList = new ArrayList<>();
        Scanner forArray = new Scanner(System.in);
        String temp ="";
        for (int i = 0; !temp.equals("exit"); i++) {
            System.out.println("enter different animals min 5: ");
            System.out.println("type exit to stop: ");

            temp = forArray.next();
            if (temp.equals("exit")) {
                break;
            }
            else {

                animalsList.add(i, temp);
            }
        }

        for (int i = 0; i<animalsList.size(); i++) {
                System.out.println("animals: " + animalsList.get(i));
        }



         /* zad.2 Napisać program który stworzy Set<Integer> i wprowadzamy 10 liczb z klawiatury
                niech liczby się powtarzają, proszę posortować a następnie wyświetlić zawartość set-a w konsoli
                 a następnie przeiterować i wyświetlić forEach-em (jak wyżej)
         */
        Scanner forTreeSet = new Scanner(System.in);
        Set<Integer> values = new TreeSet<>();
        for (int i = 0; i<10; i++) {
            System.out.println("enter different values: ");

            int temp1 = forTreeSet.nextInt();
            values.add(temp1);

        }
        System.out.println(values);

    }

}
