public class FakeBinary {
    public static String fakeBin(String numberString) {
        String fakeBin = "";

        if (numberString != "") {
            for (int i = 0; i < numberString.length(); i++) {
                char c = numberString.charAt(i);
                if (Character.getNumericValue(c) < 5) {
                    fakeBin += '0';
                } else {
                    fakeBin += '1';
                }
            }

            System.out.println(fakeBin);
        }
        return fakeBin;
    }
}
