import nl.saxion.app.SaxionApp;

import java.util.ArrayList;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application());
    }

    public void run() {
        ArrayList<String> names = new ArrayList<>();

        names.add("John");
        names.add("Steve");
        names.add("Jack");
        names.add("Jill");
        names.add("Tina");
        names.add("Ethan");
        names.add("Doug");
        names.add("Greg");
        names.add("Phillip");
        names.add("Joann");

        SaxionApp.printLine("Number of names in the list: "+ names.size());
        SaxionApp.printLine("First name in the list: " + names.get(0));
        SaxionApp.printLine("Last name in the list:  " + names.get(names.size()-1));
        SaxionApp.printLine();
        SaxionApp.printLine("Randomly selected name from the list: " + getRandomNameFromList(names));

        SaxionApp.saveImage("Exercise1/sample_output.png");
    }

    public String getRandomNameFromList(ArrayList<String> names) {
        int randomPosition = SaxionApp.getRandomValueBetween(0, names.size()); // Note that getRandomValue is NOT including the upper limit.. so .size() is safe!
        String nameFromPosition = names.get(randomPosition);

        return nameFromPosition;
    }
}
