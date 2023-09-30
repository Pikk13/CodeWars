
public class Pillars {
    public static int pillars(int numPill, int dist, int width){
        int pillars;
        if (numPill <= 1) pillars = 0;
        else pillars = (dist*100)*(numPill-1) + (width*(numPill-2));
        System.out.println(pillars);
        return pillars;
    }
}

