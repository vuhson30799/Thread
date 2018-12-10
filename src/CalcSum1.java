import java.util.Scanner;

public class CalcSum1 implements Runnable {
    long sum = 0;
    int parameter = 0;
    @Override
    public synchronized void run() {
        for (int i = 0; i <= parameter; i++) {
            sum += i;
        }
    }

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        CalcSum1 calcSum1 = new CalcSum1();
        calcSum1.parameter = scanner.nextInt();
        Thread thread = new Thread(calcSum1);
        thread.start();
        try {
            thread.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("The result is: " + calcSum1.sum);
    }
}
