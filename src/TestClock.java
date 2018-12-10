public class TestClock {
    public static void main(String[] args) {
        Clock clock = new Clock();
        Thread thread1 = new Thread(clock);

        Button button = new Button();
        Thread thread = new Thread(button);
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread1.start();
    }
}
