public class SumArray {
    public static double sum(double[] numbers) {
        double res = 0;
        for (int i = 0; i < numbers.length; i++) {
             res += numbers[i];
        }
        return res;
    }
}