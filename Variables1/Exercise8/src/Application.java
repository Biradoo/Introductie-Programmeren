import nl.saxion.app.SaxionApp;

import java.awt.*;
import java.util.ArrayList;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application(), 640, 480);
    }

    public void run() {
        ArrayList<Character> rightLetters = new ArrayList<>();
        String theRightWord = SaxionApp.readString();
        int lengthOfWord = theRightWord.length();
        int i = 0;
        while (i < lengthOfWord) {
            SaxionApp.print("_ ");
            rightLetters.add(theRightWord.charAt(i));
            i++;
        }
        

//        boolean tekenGalg(int welkeLijn) {
//            SaxionApp.setFill(Color.PINK);
//            SaxionApp.turnBorderOn();
//            SaxionApp.setBorderColor(Color.GREEN);
//            switch (welkeLijn) {
//                //galg
//                case 1 -> SaxionApp.drawLine(600, 500, 600, 200);
//                case 2 -> SaxionApp.drawLine(550, 500, 650, 500);
//                case 3 -> SaxionApp.drawLine(600, 200, 800, 200);
//                case 4 -> SaxionApp.drawLine(800, 200, 800, 250);
//
//                //poppetje
//                case 5 -> SaxionApp.drawCircle(800, 275, 25);
//                case 6 -> SaxionApp.drawOval(775, 300, 50, 100);
//                case 7 -> SaxionApp.drawLine(780, 325, 750, 300);
//                case 8 -> SaxionApp.drawLine(820, 325, 850, 300);
//                case 9 -> SaxionApp.drawLine(790, 395, 770, 420);
//                case 10 -> {
//                    SaxionApp.drawLine(810, 395, 830, 420);
//                    tekenVerliezerTekst();
//                    return false;
//                }
//            }
//            return true;
//        }
//
//
    }

}
