import java.util.ArrayList;
import java.util.List;

public class TwoToOne {

    public static String longest(String s1, String s2) {

        String sum = s1 + s2;
        System.out.println(sum);

        List<Character> characterList = new ArrayList<>();

        for (int i = 0; i < sum.length(); i++) {
            characterList.add(sum.charAt(i));

//            if (sum.charAt(0) == sum.charAt(i))
        }
        System.out.println(characterList);



        String longest1 = characterList.stream().distinct().toList().toString();
        String longest = longest1.replaceAll(", ", "");

        System.out.println(longest);
        return longest;
    }
}