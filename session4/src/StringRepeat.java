public class StringRepeat {
    public static String repeatStr(final int repeat, final String string) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < repeat; i++) {
            s.append(string);
        }
        return s.toString();
    }
}