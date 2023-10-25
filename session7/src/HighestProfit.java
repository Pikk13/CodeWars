import java.util.Arrays;

public class HighestProfit {

    public static int[] minMax(int[] arr) {
        int min = Arrays.stream(arr).min().getAsInt();
        int max = Arrays.stream(arr).max().getAsInt();
        int[] minMax = new int[]{min, max};
        return minMax;
    }
}


