import java.util.ArrayList;
import java.util.List;

public class StringSplit {
    public static String[] solution(String s) {

        List<String> pairs = new ArrayList<>();

        for (int i = 0; i < s.length(); i += 2) {
            if (i + 1 < s.length()) {
                pairs.add(s.substring(i, i + 2));
            } else {
                pairs.add(s.substring(i) + "_");
            }
        }

        return pairs.toArray(new String[pairs.size()]);
    }
}

