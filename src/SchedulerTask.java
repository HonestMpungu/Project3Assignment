import java.util.TimerTask;
import java.util.Date;

public class SchedulerTask extends TimerTask {
    Date current;
    int count =0;
    @Override
    public void run() {
        current = new Date();
        System.out.println( " Booked Date and Time :" + current );
        count++;
        if ( count==10)
        {
            System.out.println(" Exit");
            System.exit(0);
        }
    }

}
