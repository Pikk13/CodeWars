import java.util.Arrays;

public class HighAndLow {


    public static char[] highAndLow(String numbers) {
        String[] numArray = numbers.split(" ");
        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;

        for (String num : numArray) {
            int n = Integer.parseInt(num);
            highest = Math.max(highest, n);
            lowest = Math.min(lowest, n);
        }
        String result = highest + " " + lowest;
        System.out.println(result.toCharArray());
        return result.toCharArray();
    }
}
