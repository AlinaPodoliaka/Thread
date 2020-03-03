public class Main {

    static Thread1 one;
    static Thread2 two;

    public static void main(String[] args) {
        one = new Thread1();
        two = new Thread2();
        Thread thread = new Thread(two);
        one.start();
        thread.start();
    }

}
