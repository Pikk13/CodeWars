
import java.util.*;
public class FilterList {

    public static List<Object> filterList(final List<Object> list) {

        List<Object> mutableList = new ArrayList<>(list);
        List<Object> integerList = new ArrayList<>();

        for (int i = 0; i < mutableList.size(); i++) {
            if (mutableList.get(i) instanceof Integer) {
               integerList.add(mutableList.get(i));
            }
        }
        return integerList;
    }
}

