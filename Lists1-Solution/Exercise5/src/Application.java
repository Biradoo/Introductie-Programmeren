import nl.saxion.app.SaxionApp;

import java.util.ArrayList;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application(), 1024, 768);
    }

    public void run() {
        ArrayList<String> listWithNames = new ArrayList<>();

        String insertedName = readStringFromUser();

        while(!insertedName.isEmpty()) {
            listWithNames.add(insertedName);

            insertedName = readStringFromUser();
        }

        if(!listWithNames.isEmpty()) {
            SaxionApp.printLine();
            SaxionApp.printLine("Generating a random order...");
            SaxionApp.printLine();

            // Intentionally using a do-while loop.. just to give a demo of its usage! You can ofc use a while loop instead.
            do {
                int randomPosition = SaxionApp.getRandomValueBetween(0, listWithNames.size());
                String randomName = listWithNames.remove(randomPosition);

                SaxionApp.printLine(randomName + " was selected!");
                SaxionApp.pause();
            } while(!listWithNames.isEmpty());

        } else {
            SaxionApp.printLine("There is no-one to generate a random order with!");
            SaxionApp.saveImage("Exercise5/sample_output2.png");
        }

        SaxionApp.saveImage("Exercise5/sample_output.png");
    }

    public String readStringFromUser() {
        SaxionApp.print("Please enter a name, leave empty to finish: ");
        return SaxionApp.readString();
    }
}
