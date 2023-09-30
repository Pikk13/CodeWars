public class NoSpaces {
        public static String noSpace(final String x) {
            String noSpace = x.replaceAll("\s+", "");
            System.out.println(noSpace);
            return noSpace;
        }
}
