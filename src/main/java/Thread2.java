public class Thread2 implements Runnable {

    private static final int MAX = 100;
    private int counter;

    public void run() {
        for (int i = 0; i <= MAX; i++) {
            counter++;
            System.out.println("Thread2: " + counter);
        }
    }
}

