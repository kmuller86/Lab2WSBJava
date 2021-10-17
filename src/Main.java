public class Main {

    public static void main(String[] args) {

        /* cw.4  */

        /* zad.1 napisać 3 pętle for i użyc:
        a) w pierwszej pętli break
        b) w drugiej pętli continue
        c) w trzeciej pętli return
        */

        for (byte i = 123; i < 999; i++)
        {
            if (i == 127)
                break;
            System.out.println(i + "");

        }

        for ( short s = 32760; s < 32767; s++)
        {
            if (s == 32763)
                continue;
            System.out.println(s + "");
        }
        for ( long l = 999; l < 1010; l++) {
            if (l == 1009)
                return;
            System.out.println(l + "");
        }




    }
}
