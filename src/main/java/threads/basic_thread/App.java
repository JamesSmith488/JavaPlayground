package threads.basic_thread;

public class App {

    public static void main(String[] args) {
        Thread threadOne = new Thread(new Looper());
        Thread threadTwo = new Thread(new Looper());
        threadOne.start();
        threadTwo.start();
    }

}
