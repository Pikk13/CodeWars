import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortArray {

    public static int[] sortArray(int[] array) {
       List<Integer> list = Arrays.stream(array)
               .mapToObj(Integer::valueOf)
               .filter(a -> a % 2 == 1)
               .sorted()
               .collect(Collectors.toList());
        System.out.println(list);
        for (int i = 0; i < array.length; i++) {

        }
        return array;
    }
}

