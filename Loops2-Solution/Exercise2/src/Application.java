import nl.saxion.app.SaxionApp;

import java.util.ArrayList;


public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application(), 1024, 768);
    }

    public void run() {

        ArrayList<String> list = new ArrayList<>();
        SaxionApp.printLine("Please, enter some words that should be printed in a bigger font (press ENTER on an empty line to proceed).");

        String input = SaxionApp.readString(); // first input

        // loop until the input is empty (ENTER only)
        while (!input.isBlank()) {
            list.add(input);
            input = SaxionApp.readString();
        }

        SaxionApp.saveImage("Exercise2/sample_output.png");

        SaxionApp.clear();

        for (String word : list) {
            int x = SaxionApp.getRandomValueBetween(20, 300);
            int y = SaxionApp.getRandomValueBetween(40, 300);
            int font = SaxionApp.getRandomValueBetween(20, 80);

            SaxionApp.drawBorderedText(word, x, y, font);
        }

        SaxionApp.saveImage("Exercise2/sample_output1.png");

    }

}
