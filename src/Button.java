import java.util.Scanner;

public class Button implements Runnable {
    @Override
    public synchronized void run() {
        while (true){
            System.out.println("Do u want to activate thí clock? (y/n)");
            Scanner scanner = new Scanner(System.in);
            String check = scanner.nextLine();
            if (check.equals("y")) {
                break;
            }else if (check.equals("n")){

            }else {
                System.out.println("Error!! Please type again !!");
            }
        }

    }
}
