public class BetterThanAnyone {

    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        int classMatesPoints= 0;
        for (int i = 0; i < classPoints.length; i++) {
            classMatesPoints += classPoints[i];
        }
      return   (classMatesPoints + yourPoints) / (classPoints.length + 1) < yourPoints;
    }
}

