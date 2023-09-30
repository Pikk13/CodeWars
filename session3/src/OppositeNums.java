public class OppositeNums {
    public static int opposite(int number) {
        int opposite = 0;
        if (number > 0) opposite = number - number * 2;
        else if (number < 0) opposite = Math.abs(number);
        return opposite;
    }
}

