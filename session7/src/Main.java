import java.util.List;
import java.util.Objects;
import java.util.logging.Filter;

public class Main {
    public static void main(String[] args) {

        List<Object> list = List.of(1, "fasdfadsfsdffa", 2, 4, "fsdafa", "123");
        System.out.println(FilterList.filterList(list));

        System.out.println(StringToNumber.stringToNumber("1234"));

        int yourPoints = 30;
        int[] classPoints = new int[]{2, 6, 8, 13, 45, 23};

        System.out.println(BetterThanAnyone.betterThanAverage(classPoints, yourPoints));

        HighestProfit.minMax(classPoints);

        System.out.println(AlternateCase.alternateCase("HellOOOOO WorLd"));

        List<String> stringList = List.of( ":D", "fasdfadsfsdffa", ":D", "fsdafa", ":D", "123", ":)");
        System.out.println(SmileFaces.countSmileys(stringList));
    }
}