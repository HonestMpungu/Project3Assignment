package schedularNotifications;
/**
 * Simple demo that uses java.util.Timer to schedule a task
 * Honest Mpungu
 * Student 215072081
 */

import java.util.Timer;

public class SchedulersTrigger {

    public static  void main (String args []) {

        Timer time = new Timer ();
        SchedulerTask sc = new SchedulerTask();
        time.schedule(sc,0,5000);

        System.out.println("Reminder of upcoming Task!");
        Timer timer = new Timer();
        timer.cancel(); //Terminate the timer thread

        new Reminder(10);
        System.out.println("Task scheduled.");
    }

    private static class Reminder {
        public Reminder(int i) {
        }
    }
}


