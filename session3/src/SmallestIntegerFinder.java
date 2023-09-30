public class SmallestIntegerFinder {
    public static int findSmallestInt(int[] args) {
        int s = args[0];
        for (int i = 0; i < args.length; i++) {
            if (args[i] < s) s = args[i];
        }
        return s;
    }
}