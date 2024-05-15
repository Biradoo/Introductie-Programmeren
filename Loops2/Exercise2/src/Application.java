import nl.saxion.app.SaxionApp;

import java.util.ArrayList;


public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application(), 1024, 768);
    }

    public void run() {

        ArrayList<String> words = new ArrayList<>();
        SaxionApp.printLine("Please, enter some words that should be printed (press ENTER on an empty line to proceed");

        String input = SaxionApp.readString();
        words.add(input);

        while (!input.isEmpty()) {
            input = SaxionApp.readString();
            words.add(input);
        }
        SaxionApp.clear();
        drawText(words);
    }

    public void drawText(ArrayList<String> list) {
        for (String drawText : list) {
            int x = SaxionApp.getRandomValueBetween(10, 800);
            int y = SaxionApp.getRandomValueBetween(10, 800);
            int size = SaxionApp.getRandomValueBetween(10, 100);
            SaxionApp.drawBorderedText(drawText, x, y, size);
        }
    }

}
