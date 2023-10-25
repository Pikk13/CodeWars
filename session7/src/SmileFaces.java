import java.util.*;

public class SmileFaces {

    public static int countSmileys(List<String> arr) {
        List<String> smileList = new ArrayList<>(arr);
        String regex1 = ":)";
        String regex2 = ";-D";
        String regex3 = ":D";
        String regex4 = ":~)";
        String regex5 = ":~D";
        String regex6 = ";D";
        String regex7 = ":-)";
        String regex8 = ";)";

        int smileys = 0;
        if (!arr.isEmpty()) {
            for (int i = 0; i < smileList.size(); i++) {
                if (smileList.get(i).equals(regex1)) {
                    smileys++;
                    smileList.remove(smileList.get(i));
                } else if
                (smileList.get(i).equals(regex2)) {
                    smileys++;
                    smileList.remove(smileList.get(i));
                } else if (smileList.get(i).equals(regex3)) {
                    smileys++;
                    smileList.remove(smileList.get(i));
                } else if (smileList.get(i).equals(regex4)) {
                    smileys++;
                    smileList.remove(smileList.get(i));
                } else if (smileList.get(i).equals(regex5)) {
                    smileys++;
                    smileList.remove(smileList.get(i));
                } else if (smileList.get(i).equals(regex6)) {
                    smileys++;
                    smileList.remove(smileList.get(i));
                } else if (smileList.get(i).equals(regex7)) {
                    smileys++;
                    smileList.remove(smileList.get(i));

                } else if (smileList.get(i).equals(regex8)) {
                    smileys++;
                    smileList.remove(smileList.get(i));
                }
            }
        }
        return smileys;
    }
}

//import java.util.List;
//
//public class SmileFaces {
//
//    public static int countSmileys(List<String> arr) {
//        int smileys = 0;
//
//        for (String face : arr) {
//            if (face.matches("[:;][-~]?[)D]")) {
//                smileys++;
//            }
//        }
//
//        return smileys;
//    }
//}