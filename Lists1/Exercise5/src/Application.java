import nl.saxion.app.SaxionApp;

import java.util.ArrayList;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application(), 1024, 768);
    }

    public void run() {

        ArrayList<String> listOfNames = new ArrayList<>();
        String name = printAName();


        while (!name.isEmpty()) {
            listOfNames.add(name);
            name = printAName();
        }
        if (!listOfNames.isEmpty()) {
            SaxionApp.printLine();
            SaxionApp.printLine("Generating a random order...");
            SaxionApp.printLine();


            while (!listOfNames.isEmpty()) {
                int indexNumber = SaxionApp.getRandomValueBetween(0, listOfNames.size());
                String randomName = listOfNames.remove(indexNumber);
                SaxionApp.printLine(randomName + " was selected!");

            }
        }
    }

    public String printAName() {
        SaxionApp.print("Please enter a name, leave empty to finish: ");
        return SaxionApp.readString();
    }
}

