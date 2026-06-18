public class AngleBetweenHandsofaClock {
    static double angleClock(int hour, int minutes) {
        double hourAngle = hour * 30 + minutes * 0.5;
        double minuteAngle = minutes * 6;
        double diff = Math.abs(hourAngle - minuteAngle);

        diff = Math.min(diff, 360 - diff);

        return diff;
    }

    public static void main(String[] argu) {
        System.out.println(angleClock(12, 30));
    }
}