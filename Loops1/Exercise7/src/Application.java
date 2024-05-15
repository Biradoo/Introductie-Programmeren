import nl.saxion.app.SaxionApp;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application(), 1024, 768);
    }

    public void run() {

        SaxionApp.print("Height? ");
        int height = SaxionApp.readInt();

        int row = 1;
        while (row <= height) {

            int noOfSpaces = 0;
            while (noOfSpaces < (height-row)) {
                SaxionApp.print(" ");
                noOfSpaces++;
            }
            int noOfHashes = 0;
            while (noOfHashes < row) {
                SaxionApp.print("#");
                noOfHashes++;
            }

            row++;
        }


    }

}
