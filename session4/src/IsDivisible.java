
public class IsDivisible {
    public static boolean isDivisible(long n, long x, long y) {
        double nx = (double) n / x;
        double ny = (double) n / y;
        return (nx % 1 == 0) && (ny % 1 == 0);
    }
}

