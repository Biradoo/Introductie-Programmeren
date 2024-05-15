import nl.saxion.app.SaxionApp;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application(), 1024, 768);
    }

    public void run() {

        SaxionApp.print("Height? ");
        int height = SaxionApp.readInt();

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                SaxionApp.print("#");
            }
            SaxionApp.printLine();
        }
    }
}
