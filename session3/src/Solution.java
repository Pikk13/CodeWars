public class Solution {
    public static int century(int number) {
        int c = 0;
if (number % 100 == 0) c = number / 100;
else c = number / 100 + 1;
return c;
    }
}