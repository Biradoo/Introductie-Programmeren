import nl.saxion.app.SaxionApp;

import java.awt.*;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application(), 500, 500);
    }

    public void run() {
        String input = "Hello!"; // <-- You could make it dependend on the input of the user, but we won't!
        String expectedResult = "!olleH";
        String receivedResult = reverseString(input);

        SaxionApp.print("The input is: ");
        SaxionApp.printLine(input, Color.ORANGE);

        SaxionApp.print("The reverse is: ");
        SaxionApp.printLine(receivedResult, Color.ORANGE);

        if (receivedResult.equals(expectedResult)) {
            SaxionApp.printLine("This is correct!", Color.GREEN);
            SaxionApp.saveImage("Exercise6/sample_output.png");
        } else {
            SaxionApp.printLine("This is incorrect!", Color.RED);
            SaxionApp.saveImage("Exercise6/sample_output2.png");
        }
    }

    public String reverseString(String input) {

        for (int i = input.length() - 1; i >= 0; i--) {
            SaxionApp.print(input.charAt(i));
            return "";
        }

        return input;
    }
}


