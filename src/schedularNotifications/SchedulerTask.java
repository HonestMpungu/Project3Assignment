package schedularNotifications;

/**
 * Simple demo that uses java.util.Timer to schedule a task
 * Honest Mpungu
 * Student 215072081
 */
import java.util.TimerTask;
import java.util.Date;

public class SchedulerTask extends TimerTask {
    Date current;
    int count =0;
    private Object jobContext;

    @Override
    public void run() {

        System.out.println("--------------------------------------------------------------------");
        current = new Date();
        System.out.println( " Date of appointment and Time :" + current );
        count++;
        if ( count==05)
        {
            System.out.println(" Exit");
            System.exit(0);
        }
    }
        }


