import java.util.Timer;

public class SchedulersTrigger {

    public static  void main (String args []) {

        Timer time = new Timer ();
        SchedulerTask sc = new SchedulerTask();
        time.schedule(sc,0,5000);
    }

}
