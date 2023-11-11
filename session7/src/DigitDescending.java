import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DigitDescending {
    public static int sortDesc(final int num) {

        String numberString = Integer.toString(num);
        char[] charArray = numberString.toCharArray();


        int[] intArray = new int[charArray.length];
        for (int i = 0; i < charArray.length; i++) {

            intArray[i] = Character.getNumericValue(charArray[i]);
        }
        Arrays.sort(intArray);


        for (int i = 0; i < intArray.length / 2; i++) {
            int temp = intArray[i];
            intArray[i] = intArray[intArray.length - 1 - i];
            intArray[intArray.length - 1 - i] = temp;
        }

        System.out.println(Arrays.toString(intArray));

        return 0;
    }
}
