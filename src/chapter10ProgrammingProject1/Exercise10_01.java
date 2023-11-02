package chapter10ProgrammingProject1;

// write time class

public class Exercise10_01 {
    public static void main(String[] args) {
        Time time1 = new Time();
        Time time2 = new Time(555550000);
        Time time3 = new Time(5, 23, 55);

        System.out.println("Time 1: " + time1.getHour() + ":" + time1.getMinute() + ":" + time1.getSecond());
        System.out.println("Time 2: " + time2.getHour() + ":" + time2.getMinute() + ":" + time2.getSecond());
        System.out.println("Time 3: " + time3.getHour() + ":" + time3.getMinute() + ":" + time3.getSecond());
    }
}

class Time {
    private long hour;
    private long minute;
    private long second;

    public Time() {
        long currentTime = System.currentTimeMillis();
        setTime(currentTime);
    }

    public Time(long elapsedTime) {
        setTime(elapsedTime);
    }

    public Time(long hour, long minute, long second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public long getHour() {
        return hour;
    }

    public long getMinute() {
        return minute;
    }

    public long getSecond() {
        return second;
    }

    public void setTime(long elapsedTime) {
        long totalSeconds = elapsedTime / 1000;
        second = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        minute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        hour = totalHours % 24;
    }
}