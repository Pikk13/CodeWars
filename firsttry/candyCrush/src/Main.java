import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        char[] fruits = new char[6]; // gyümölcskaraktertömb létrehozása - ez tárolja a gyümölcsöket

        fruits[0] = 'A';
        fruits[1] = 'B';
        fruits[2] = 'C';
        fruits[3] = 'D';
        fruits[4] = 'E';
        fruits[5] = 'F';

// A  fenti sorok: a gyümölcstömb feltöltése karakterekkel

        Random random = new Random(); // randomgenerátor importálása

        char[][] map = new char[8][8];
        for (int i = 0; i < map.length; i++) {
            System.out.println(); // ezzel tördeli meg a sorokat
            for (int j = 0; j < map[i].length; j++) {
                map[i][j] = fruits[random.nextInt(fruits.length)]; // 2D tömb bejárása, majd feltöltése véletlenszerű
                // karakterekkel a gyümölcstömbből

                System.out.print(map[i][j] + " "); // Kiíratás helyközzel
            }
        }

        System.out.println();


        Scanner sc = new Scanner(System.in);
        System.out.println("Hanyadik sorban található a gyümölcs, amit meg szeretnél cserélni egy mellette lévővel!");
        int row1 = sc.nextInt();
        if (row1 < 0 || row1 > 7) {
            System.out.println("Helytelen szám, a sorok száma 0-7-ig terjed, futtasd újból a játékot");
            return;
        }


        System.out.println("Hanyadik oszlopban található a gyümölcs, amit meg szeretnél cserélni egy mellette lévővel!");
        int col1 = sc.nextInt();
        if (col1 < 0 || col1 > 7) {
            System.out.println("Helytelen szám, az oszlopok száma 0-7-ig terjed, futtasd újból a játékot");
            return;
        }

        System.out.println("Hanyadik sorba szeretnéd áttenni a gyümölcsöt?");
        int row2 = sc.nextInt();
        if (row2 < 0 || row2 > 7) {
            System.out.println("Helytelen szám, a sorok száma 0-7-ig terjed, futtasd újból a játékot");
            return;
        }
        System.out.println("Hanyadik oszlopba szeretnéd áttenni a gyümölcsöt?");
        int col2 = sc.nextInt();
        if (col2 < 0 || col2 > 7) {
            System.out.println("Helytelen szám, az oszlopok száma 0-7-ig terjed, futtasd újból a játékot!");
            return;
        }

        System.out.println("Az általad megadott koordináták a következők:");
        System.out.println("Mit: " + "sor: " + row1 + " " + "oszlop: " + col1);
        System.out.println("Hova: " + "sor: " + row2 + " " + "oszlop: " + col2);

        char temp = map[row1][col1];

        System.out.println("A választott karakter: " + temp);


        char temp2 = map[row2][col2];

        System.out.println("A cserélendő karakter: " + temp2);


        temp = map[row2][col2];
        map[row2][col2] = map[row1][col1];
        map[row1][col1] = temp;

//        map[row1][col1] = map[row2][col2];

//        temp = temp2;
//        System.out.println(temp);
//        System.out.println(temp2);

        for (int i = 0; i < map.length; i++) {
            System.out.println();
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");    // !!!!!!!!!! A RÉGI MAP-ot DOBJA KI, A VÁLTOZTATÁST NEM


            }

        }
    }
}

//        System.out.println();
//        int points = 5;
//        for (int i = 0; i < map.length; i++) {
//            if (points == 5) {
//                System.out.println("Gratulálok, nyertél! Elérted a maximálisan elérhető pontszámot!");
//                return;
//            }




