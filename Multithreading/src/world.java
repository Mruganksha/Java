/*
public class world extends Thread{
    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread Running: " + i);
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println("ThreadExample interrupted: " + e.getMessage());
        }
    }
}

class UncheckedException {
    public static void divide() {
        try {
            int result = 10 / 0;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught an ArithmeticException: " + e.getMessage());
        }
    }
}
*/

public class world implements Runnable{
    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread Running: " + i);
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println("ThreadExample interrupted: " + e.getMessage());
        }
    }
}

class UncheckedException {
    public static void nullString() {
        try {
            String s = null;
            System.out.println("Result: " + s);
        } catch (NullPointerException e) {
            System.out.println("Caught an NullPointer Exception: " + e.getMessage());
        }
    }
}