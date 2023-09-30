

public class Main {
    public static void main(String[] args) {
        String sentence1 = "Hey fellow warriors";
        String sentence2 = "This is a test";
        String sentence3 = "This is another test";

        System.out.println(spinWords(sentence1));
        System.out.println(spinWords(sentence2));
        System.out.println(spinWords(sentence3));
    }

    public static String spinWords(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (word.length() >= 5) {
                StringBuilder reversedWord = new StringBuilder(word);
                result.append(reversedWord.reverse());
            } else {
                result.append(word);
            }
            result.append(" ");
        }

        return result.toString().trim();
    }
}