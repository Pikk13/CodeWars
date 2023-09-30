public class NeedleInTheHaystack {

    public static String findNeedle(Object[] haystack) {
    int index = 0;
    if (haystack.length > 0) {
        for (int j = 0; j < haystack.length; j++) {
            if (haystack[j].equals("needle")) {
                index = j;
            }
        }
    }
        return "found the needle at position " + index;
    }
}
