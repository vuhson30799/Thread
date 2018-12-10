import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class TimerTest implements Runnable {
    Timer timer;
    int sum = 0, delay = 0;

    @Override
    public void run() {
        timer = new Timer();
        Random x = new Random();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Time's up");
                timer.cancel();
                timer = null;
            }
        }, 5000);
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
            try {
                delay = 100 + x.nextInt(800);
                sum += delay;
                System.out.println("Delay time: " + sum);
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (timer == null){
                break;
            }
        }

    }

    public static void main(String[] args) {
        TimerTest timerTest = new TimerTest();
        Thread thread = new Thread(timerTest);
        thread.start();

    }
}
