public class Clock {
    public static int Past(int h, int m, int s) {
        int timeSinceMidnight=0;
        if ((h >= 0 && h <= 23) && (m >= 0 && m <= 59) && (s >= 0 && s <= 59)) {
            timeSinceMidnight = (h * 3600000) + (m * 60000) + (s * 1000);
        } else System.out.println("Out of boundaries: hours 0-23, minutes and seconds 0-59");
        System.out.println(timeSinceMidnight);
        return timeSinceMidnight;
    }
}