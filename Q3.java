public class Q3
{
    public static void main(String[] args)
    {
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;

        long currentSecond = totalSeconds % 60;
        long totalMinutes  = (totalSeconds / 60) + (8 * 60); // Singapore timezone is GMT+8

        long currentMinute = totalMinutes % 60;
        long totalHours    = totalMinutes / 60;

        long currentHour   = totalHours % 24;
        System.out.print("Current SGT time is " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT+8");
    }
}