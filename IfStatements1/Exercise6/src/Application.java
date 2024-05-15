import nl.saxion.app.SaxionApp;

import java.awt.*;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application(), 640, 300);
    }

    public void run() {

        String password;
        while (true) {      //zodat de loop blijft doorgaan totdat user een juist wachtwoord invoert
            SaxionApp.print("Set an initial password: ");
            password = SaxionApp.readString();

            if (password.length() < 5) {
                SaxionApp.printLine("That password is too short!", Color.orange);
            } else if (password.length() > 20) {
                SaxionApp.printLine("That password is too long!", Color.orange);
            } else {
                break;
            }

        }
        SaxionApp.printLine("Your password has been set!", Color.green);
        SaxionApp.printLine("The next password cannot be similar to the first password.");

        while (true) {
            SaxionApp.print("Set a new password: ");
            String newPassword = SaxionApp.readString();

            if (!newPassword.equals(password)) {
                SaxionApp.printLine("You cannot use the same password twice! ", Color.RED);
            } else {
                break;
            }
        }
        SaxionApp.printLine("Password changed succesfully! ", Color.green);
    }
}
