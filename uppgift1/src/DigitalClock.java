import java.text.DateFormat;
import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.TimeZone;

public class DigitalClock implements Runnable{

    private Thread clockThread;
    public DigitalClock() {
        clockThread = null;
    }

    synchronized public void startClock() {
        if( clockThread == null ) {
            clockThread = new Thread( this );
            clockThread.start();
        }
    }

    synchronized public void stopClock() {
        clockThread = null;
    }

    public void run() {
        while( Thread.currentThread() == clockThread ) {
            // normally, no io here, but this is an example illustrating how to manage threads
            System.out.println(LocalTime.now());
            try {
                Thread.sleep( 1000 );
            }
            catch( InterruptedException ie ) {}
        }
    }
}
