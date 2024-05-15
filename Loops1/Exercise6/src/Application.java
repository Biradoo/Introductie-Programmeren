import nl.saxion.app.SaxionApp;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application());
    }

    public void run() {

        SaxionApp.print("Input a sentence: ");
        String sentence = SaxionApp.readString();

        for (int i = sentence.length()-1; i >= 0; i--) {
            SaxionApp.print(sentence.charAt(i));
        }
    }
}
