import java.util.Arrays;
import java.util.List;

public class Meeting {

    public static String meeting(String s) {
       String sUpper = s.toUpperCase().replace(":", " ");
        System.out.println(sUpper);


        String fullName = null;
        String firstName = null;
        String lastName = null;
        String[] fullNameArray = null;
        String[] stringArray = sUpper.split(";");

        Arrays.stream(stringArray).toList().stream().map(String::chars).forEach(System.out::println);

        for (int i = 0; i < stringArray.length; i++) {
            fullName = stringArray[i];
            fullNameArray = fullName.split(" ");
            for (int j = 0; j < fullNameArray.length; j++) {
                firstName = fullNameArray[j];
                lastName = fullNameArray[j+1];
                j++;
                System.out.println(firstName);
                System.out.println(lastName);
            }

        }


        return null;
    }
}
