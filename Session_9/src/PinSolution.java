import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PinSolution {

    public static boolean validatePin(String pin) {
        String regexFourDigit = "[0-9][0-9][0-9][0-9]";
        String regexSixDigit = "[0-9][0-9][0-9][0-9][0-9][0-9]";
        Pattern p4 = Pattern.compile(regexFourDigit);
        Pattern p6 = Pattern.compile(regexSixDigit);

        Matcher m = p4.matcher(pin);
        Matcher m2 = p6.matcher(pin);


        return m.matches() || m2.matches();
    }

}
