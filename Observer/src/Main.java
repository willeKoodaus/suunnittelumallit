
public class Main {

	public static void main(String[] args) {
		ClockTimer clock = new ClockTimer();
        DigitalClock digitalClock = new DigitalClock(clock);
        Thread thread = new Thread(clock);
        thread.start();
	}

}
