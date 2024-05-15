import nl.saxion.app.SaxionApp;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application());
    }

    public void run() {
        // Size of each cell
        int size = 50;

        // Resize the frame to fit - We'll leave 2 "squares" on the left, right, top and bottom as padding..
        // (So the regular 3x3 field becomes a 7x7 field when drawn)
        SaxionApp.resize(7*size, 7*size);

        // 2 horizontal lines - Remember to base this of size now!

        // 2 vertical lines - Use the size variable again!

        // Create 9 variables for the characters to print, one for each position

        // [Optional] Disable border

        // 3 marks, crosses and noughts, on locations 1,5 and 9.

    }

}
