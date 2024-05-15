import nl.saxion.app.SaxionApp;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application(), 1024, 200);
    }

    public void run() {
        SaxionApp.printLine("This screen is not used! Check for output at the bottom of your screen!");

        for (int i = 100; i >= 1; i--) {
            System.out.println(i);
        }
    }

}
