import java.util.Arrays;

public class MonkeyCounter
{
    public static int[] monkeyCount(final int n){

        int [] monkeyCount = new int[n];
        for (int i = 0; i < monkeyCount.length; i++) {
            monkeyCount[i] = i + 1;
        }
        System.out.println(Arrays.toString(monkeyCount));
    return monkeyCount;
    }
}