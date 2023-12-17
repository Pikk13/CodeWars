import java.math.BigInteger;

public class AddingBigNumbers {
    public static String add(String a, String b) {
        if (a.isEmpty() || b.isEmpty()) return null;
        BigInteger bigIntegerA = new BigInteger(a);
        BigInteger bigIntegerB = new BigInteger(b);
        BigInteger res = bigIntegerA.add(bigIntegerB);
        return res.toString();
    }
}