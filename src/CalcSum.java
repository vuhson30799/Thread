import java.util.Scanner;

public class CalcSum implements Runnable {
    private int parameter = 0;
    private long sum = 0;
    @Override
    public void run() {
        for (int i = 0; i <= parameter; i++) {
            sum += i;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalcSum calcSum = new CalcSum();
        calcSum.parameter = scanner.nextInt();
        System.out.println("The parameter is: " + calcSum.parameter);
        Thread thread1 = new Thread(calcSum);
        thread1.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("The result is: " + calcSum.sum);
    }

}
