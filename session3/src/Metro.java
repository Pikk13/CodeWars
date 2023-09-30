import java.util.ArrayList;

class Metro {
    public static int countPassengers(ArrayList<int[]> stops) {
        int countPassengers = 0;
        for (int i = 0; i < stops.size(); i++) {
            int[] stop = stops.get(i);
            countPassengers += stop[0];
            countPassengers -= stop[1];
        }
        return countPassengers;
    }
}