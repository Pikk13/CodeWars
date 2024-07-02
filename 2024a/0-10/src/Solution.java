import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc = new Scanner(System.in);

        System.out.println("================================");

        for (int i = 0; i < 3; i++) {
            String str = sc.next();
            int integer = sc.nextInt();

            String regexp = "^[a-zA-Z]+$";

            if (str.length() <= 10 && str.matches(regexp) && integer < 1000 && integer >= 0) {
                System.out.printf("%-15s%03d%n", str, integer);
            }
        }

        System.out.println("================================");
    }
}
