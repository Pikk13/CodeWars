import java.util.Arrays;

public class TowerBuilder {
    public static String[] towerBuilder(int nFloors) {
        String[] starTower = new String[nFloors];
        for (int i = 0; i < nFloors; i++) {
            int spaces = nFloors - i - 1;
            int stars = i * 2 + 1;
            starTower[i] = " ".repeat(spaces) + "*".repeat(stars) + " ".repeat(spaces);
        }

        System.out.println("[");
        for (int i = 0; i < starTower.length; i++) {
            System.out.print("  \"" + starTower[i] + "\"");
            if (i < starTower.length - 1) {
                System.out.println(",");
            } else {
                System.out.println();
            }
        }
        System.out.println("]");

        return starTower;
    }

    public static void main(String[] args) {
        towerBuilder(1);  // Példa meghívás
        System.out.println();
        towerBuilder(3);  // Másik példa meghívás
    }
}
