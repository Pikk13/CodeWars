public class Count {
    public static int[] countBy(int x, int n) {
        int[] res = new int[n];
        if (x >= 1 && n >= 1) {
            for (int i = 0; i < res.length; i++) {
                res[i] = x * (i + 1);
            }
        } else {
            System.out.println("X and N nums must be positive!");
        }
        return res;
    }
}