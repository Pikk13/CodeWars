public class StringReverse {
    public static String solution(String str) {
        char[] ch = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = ch.length - 1; i > -1; i--) {
            sb.append(ch[i]);
        }
        System.out.println(sb.toString());
        return sb.toString();
    }
}
