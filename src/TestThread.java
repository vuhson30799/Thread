public class TestThread {
    public static void main(String[] args) {
        Thread thread1 = new OddThread();
        Thread thread2 = new EvenThread();
        thread1.start();
        thread2.start();
    }
}
