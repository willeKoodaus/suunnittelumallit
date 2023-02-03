import java.util.Observable;
import java.util.Observer;

public class DigitalClock implements Observer {
    private ClockTimer clock;
  
    public DigitalClock(ClockTimer clock) {
        this.clock = clock;
        clock.addObserver(this);
    }
  
    @Override
    public void update(Observable o, Object arg) {
    	draw();
    }

  private void draw() {
    int hour = clock.getHour();
    int minute = clock.getMinute();
    int second = clock.getSecond();

    System.out.println(String.format("%02d:%02d:%02d", hour, minute, second));
  }
}
