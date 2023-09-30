public class NumberFun {
    public static long findNextSquare(long sq) {
        double doubleNUM = (double) sq;
        long findNextSquare = 0;
        if (Math.sqrt(doubleNUM) % 2 == 0 || Math.sqrt(doubleNUM) % 2 == 1) {
            findNextSquare = (long) ((Math.sqrt(doubleNUM) + 1) * (Math.sqrt(doubleNUM) + 1));
        } else return -1;

        return findNextSquare;
    }
}