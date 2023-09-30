public class Accumul {

    public static String accum(String s) {

        StringBuilder accum = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            accum.append(Character.toUpperCase(c));
            accum.append(String.valueOf(Character.toLowerCase(c)).repeat(i));
            if (i < s.length() - 1) {
                accum.append("-");
            }
        }
        return accum.toString();
    }
}