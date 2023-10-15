public class SquareSum {
    public static int squareSum(int[] n) {
        int squareSum = 0;
        for (int i = 0; i < n.length; i++) {
            squareSum += (n[i] * n[i]);
        }
        return squareSum;
    }
}
