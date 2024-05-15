import nl.saxion.app.SaxionApp;

import java.awt.*;
import java.util.ArrayList;
import java.util.Random;


public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application());
    }

    public void run() {
        ArrayList<String> listWithWords = new ArrayList<String>();
        String inputWord = "";

        SaxionApp.printLine("Give me words, one word at a time, followed by ENTER:");
        SaxionApp.printLine("If you ENTER twice, input will stop.");

        // first request for input
        SaxionApp.print("A text: ");
        inputWord = SaxionApp.readString();

        // add input to list
        // and ask for more input so long nr 0 is not given
        while (!inputWord.isEmpty()) {
            listWithWords.add(inputWord);
            SaxionApp.print("A word: ");
            inputWord = SaxionApp.readString();
        }
        SaxionApp.saveImage("Exercise6/sample_output1.png");

        // respons to the list that is inputted
        if (listWithWords.isEmpty()) {
            SaxionApp.printLine();
            SaxionApp.printLine("The list is empty, you did not input any words.");
            SaxionApp.saveImage("Exercise6/sample_output3.png");

        } else {

            SaxionApp.printLine();
            SaxionApp.printLine("You entered " + listWithWords.size() + " words.");
            SaxionApp.printLine(listWithWords);

            // switch first and last entry
            int lastIndex = listWithWords.size() - 1;
            String tempLastWord = listWithWords.get(lastIndex);
            // the two lines above can be combined into one line of code, try it out:
            // String tempLastWord = listWithWords.get(listWithWords.size()-1);
            listWithWords.set(listWithWords.size() - 1, listWithWords.get(0));
            listWithWords.set(0, tempLastWord);
            // print the result
            SaxionApp.printLine();
            SaxionApp.printLine("When I switch the first and last word we get: ");
            SaxionApp.printLine(listWithWords);

            int middlePosition = listWithWords.size() / 2;
            String upperCaseWord = listWithWords.get(middlePosition).toUpperCase();
            SaxionApp.printLine();
            SaxionApp.print("The word with index " + middlePosition + " in capitals: ");
            SaxionApp.printLine(upperCaseWord);
            // the five lines above can be combined to one line of code:
            // SaxionApp.print("The word with index " + listWithWords.size()/2 + " in capitals: ");
            // SaxionApp.printLine(listWithWords.get(listWithWords.size()/2).toUpperCase());
            // efficient, but this one line is more difficult to understand of you read it.
            // there is always a trade-off. Do what works for you.
            // If you don't understand your own code, make it easier to read.

            listWithWords.remove(listWithWords.size() / 2);
            SaxionApp.printLine();
            SaxionApp.printLine("I removed the middle argument. The list now has " + listWithWords.size() + " elements");
            SaxionApp.printLine(listWithWords);

            SaxionApp.printLine();
            SaxionApp.printLine("Bye bye");

            SaxionApp.saveImage("Exercise6/sample_output2.png");

        }


    }
}
