public class AlternateCase {

    static String alternateCase(final String string) {
        char lowerOrUpper;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            char iii = string.charAt(i);
            System.out.println(iii);
            if (Character.isUpperCase(iii)) {
                lowerOrUpper = Character.toLowerCase(iii);
                sb.append(lowerOrUpper);
            } else {
                lowerOrUpper = Character.toUpperCase(iii);
                sb.append(lowerOrUpper);
            }
        }
        return sb.toString();
    }
}
