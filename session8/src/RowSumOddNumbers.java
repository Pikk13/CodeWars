public class RowSumOddNumbers {
    public static int rowSumOddNumbers(int n) {
        int startNumber = n * (n - 1) + 1;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += startNumber + 2 * i;
        }
        return sum;
    }
}

