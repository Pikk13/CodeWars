public class PigLatin {

    public static String pigIt(String str) {

        String[] latinArray = str.split(" ");

        StringBuilder result = new StringBuilder();

        for (String word : latinArray) {
            char firstChar = word.charAt(0);
            String restOfWord = word.substring(1);
            String newWord = restOfWord + firstChar;
            result.append(newWord).append("ay").append(" ");
        }

        return result.toString().trim();
    }
}
