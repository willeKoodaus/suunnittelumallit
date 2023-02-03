import java.time.LocalTime;
import java.util.Observable;

public class ClockTimer extends Observable implements Runnable {
	private int hour, minute, second;
	
	public int getHour(){
	    return hour;
	  }
	  
	  public int getMinute(){
	    return minute;
	  }
	  
	  public int getSecond(){
	    return second;
	  }
	  
	public void run() {
        while (second < 11 ) {
            try {
                Thread.sleep(1000);
                tick();
                setChanged();
        	    notifyObservers();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
	public void tick() {
	    second++;
	    if (second == 60) {
	      second = 0;
	      minute++;
	    }
	    if (minute == 60) {
	      minute = 0;
	      hour++;
	    }
	    if (hour == 24) {
	      hour = 0;
	    } 
	  }
}
