class Time {
    private int hours;
    private int minutes;

    // Constructor 1: Default constructor (00:00)
    public Time() {
        this.hours = 0;
        this.minutes = 0;
    }

    // Constructor 2: With hours and minutes
    public Time(int hours, int minutes) {
        this.hours = hours + minutes / 60;
        this.minutes = minutes % 60;
    }

    // Constructor 3: With total minutes only
    public Time(int totalMinutes) {
        this.hours = totalMinutes / 60;
        this.minutes = totalMinutes % 60;
    }

    // Method to display the time
    public void display() {
        System.out.printf("%02d:%02d\n", hours, minutes);
    }

    // Method to add two time objects
    public Time add(Time other) {
        int totalMinutes = (this.hours + other.hours) * 60 + this.minutes + other.minutes;
        return new Time(totalMinutes);
    }

    // Method to find difference (absolute) between two time objects
    public Time difference(Time other) {
        int t1 = this.hours * 60 + this.minutes;
        int t2 = other.hours * 60 + other.minutes;
        int diffMinutes = Math.abs(t1 - t2);
        return new Time(diffMinutes);
    }
}

public class TimeApp {
    public static void main(String[] args) {
        // Create time objects using different constructors
        Time t1 = new Time(2, 45);       // 2:45
        Time t2 = new Time(100);         // 1:40 (from 100 minutes)
        Time t3 = new Time();            // 0:00

        System.out.println("Time 1:");
        t1.display();

        System.out.println("Time 2:");
        t2.display();

        // Add two times
        Time sum = t1.add(t2);
        System.out.println("Sum of Time 1 and Time 2:");
        sum.display();

        // Difference between two times
        Time diff = t1.difference(t2);
        System.out.println("Difference between Time 1 and Time 2:");
        diff.display();
    }
}

