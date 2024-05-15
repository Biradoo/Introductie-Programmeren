import nl.saxion.app.SaxionApp;

import java.util.ArrayList;


public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application());
    }

    public void run() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        SaxionApp.printLine("Please, enter some numbers. Close with 0 (zero):");

        int counter = 1;
        SaxionApp.print("Value " + counter + ": ");
        int value = SaxionApp.readInt();

        while(value != 0){
            list.add(value);
            counter++;

            SaxionApp.print("Value " + counter + ": ");
            value = SaxionApp.readInt();
        }

//        SaxionApp.saveImage("Exercise1/sample_output.png");

        SaxionApp.printLine();
        SaxionApp.printLine("Let's turn around your list:");

        int i = list.size()-1;

        while(i>=0){
            SaxionApp.printLine(list.get(i));
            i--;
        }

        SaxionApp.saveImage("Exercise1/sample_output1.png");

    }
}
