import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println(Troll.disemvowel("WhAt is this, my Majesty?"));

        TowerBuilder.towerBuilder(3);

        System.out.println(Arrays.toString(StringToArray.stringToArray("Hello BABY")));

        Boolean[] sheeps = new Boolean[]{true, false, true, true, false, true, true, false};

        Counter counter = new Counter();
        counter.countSheeps(sheeps);

    }
}