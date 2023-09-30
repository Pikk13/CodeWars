import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        System.out.println("*********************TimeSinceMidnightInMillis********************");
        Clock.Past(0, 1, 60);
        System.out.println("*********************MonkeyCounter********************");
        MonkeyCounter.monkeyCount(10);
        System.out.println("*********************NoSpaces********************");
        NoSpaces.noSpace("8, 11   111   zzfzdasfs fadsfs fasdf fadsf trr AAA");
        System.out.println("*********************NumberFun********************");
        System.out.println(NumberFun.findNextSquare(100));
        System.out.println("*********************HighAndLow********************");
        HighAndLow.highAndLow("1 2 3 4 5 -3");  // nem ment át a codewars szűrőn, pedig OKÉS
        System.out.println("*********************TwoToOne********************");
        TwoToOne.longest("fsadfsadff", "AAAAasdfasdfasdfhbnnnnn"); // nem ment át a codewars szűrőn, pedig OKÉS
        System.out.println("*********************FakeBinary********************");
        FakeBinary.fakeBin("124345456457892233");
        System.out.println("*********************Pillars********************");
        Pillars.pillars(5, 10, 100);
        System.out.println("*********************Metro-PASSENGERS********************");
        int[] stop1 = new int[]{1, 0};
        int[] stop2 = new int[]{9, 1};
        int[] stop3 = new int[]{5, 3};
        int[] stop4 = new int[]{4, 1};
        int[] stop5 = new int[]{2, 6};

        ArrayList<int[]> stops = new ArrayList<>();
        stops.add(0, stop1);
        stops.add(1, stop2);
        stops.add(2, stop3);
        stops.add(3, stop4);
        stops.add(4, stop5);

        System.out.println(Metro.countPassengers(stops));
        System.out.println("*********************NeedleInTheHaystack********************");
        String[] haystack = new String[]{"papi", "mapi", "needle", "boxi", "foxi"};
        System.out.println(NeedleInTheHaystack.findNeedle(haystack));
        System.out.println("*********************FirstNonConsecutive********************");
        final int [] array = new int[]{1,2,3,8,10,11,13};
        System.out.println(FirstNonConsecutive.find(array));
        System.out.println("*********************Accumul********************");
        String s = "abcd";
        System.out.println(Accumul.accum(s));
        System.out.println("*********************EvenOrOdd********************");
        System.out.println(EvenOrOdd.even_or_odd(3));
        System.out.println("*********************OppositeNumbers********************");
        System.out.println(OppositeNums.opposite(56));
        System.out.println("*********************Solution********************");
        System.out.println(Solution.century(1256));
        System.out.println("*********************SmallestIntegerFinder********************");
        int [] nums = new int[]{3, 6, 9, 17, 5, 99, -4, 33};
        System.out.println(SmallestIntegerFinder.findSmallestInt(nums));
    }
}