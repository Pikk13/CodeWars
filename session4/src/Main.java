import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = new int[]{2,7,9,56,-9,8,13};
        System.out.println("********************StringRepeat********************");
        System.out.println(StringRepeat.repeatStr(5, "Szia"));
        System.out.println("********************FindAverage********************");
        System.out.println(FindAverage.find_average(nums));
        System.out.println("********************IsDivisible********************");
        System.out.println(IsDivisible.isDivisible(100, 5, 21));
        System.out.println("********************Paper********************");
        System.out.println(Paper.paperWork(4, 10));
        System.out.println("********************SortArray********************");

        int [] array = new int[] {1, 5, 12, 7, 4, 3};
        SortArray.sortArray(array);

    }
}