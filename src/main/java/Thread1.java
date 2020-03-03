public class Thread1 extends Thread {

    private static final int MAX = 100;
    private int counter;

    @Override
    public void run() {
        for (int i = 0; i <= MAX; i++) {
            counter++;
            System.out.println("Thread1: " + counter );
        }
    }
}
