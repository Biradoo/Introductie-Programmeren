import nl.saxion.app.SaxionApp;

import java.util.ArrayList;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application());
    }

    public void drawBoard(int size, ArrayList<String> gameBoard){
        // bordersize was set to 0, but we need a border to make te lines more visible
        SaxionApp.setBorderSize(2);

        // 2 horizontal lines
        SaxionApp.drawLine(2 * size, 2 * size, 5 * size, 2 * size);
        SaxionApp.drawLine(2 * size, 3 * size, 5 * size, 3 * size);

        // 2 vertical lines
        SaxionApp.drawLine(3 * size, 1 * size, 3 * size, 4 * size);
        SaxionApp.drawLine(4 * size, 1 * size, 4 * size, 4 * size);

        // bordersize 0 makes the text easier to read
        SaxionApp.setBorderSize(0);

        // Update of the board after one move of playerX
        SaxionApp.drawBorderedText(gameBoard.get(0), (int) (size * 2.4), (int) (size * 1.4), 20);
        SaxionApp.drawBorderedText(gameBoard.get(1), (int) (size * 3.4), (int) (size * 1.4), 20);
        SaxionApp.drawBorderedText(gameBoard.get(2), (int) (size * 4.4), (int) (size * 1.4), 20);
        SaxionApp.drawBorderedText(gameBoard.get(3), (int) (size * 2.4), (int) (size * 2.4), 20);
        SaxionApp.drawBorderedText(gameBoard.get(4), (int) (size * 3.4), (int) (size * 2.4), 20);
        SaxionApp.drawBorderedText(gameBoard.get(5), (int) (size * 4.4), (int) (size * 2.4), 20);
        SaxionApp.drawBorderedText(gameBoard.get(6), (int) (size * 2.4), (int) (size * 3.4), 20);
        SaxionApp.drawBorderedText(gameBoard.get(7), (int) (size * 3.4), (int) (size * 3.4), 20);
        SaxionApp.drawBorderedText(gameBoard.get(8), (int) (size * 4.4), (int) (size * 3.4), 20);

        // change output png for every demo.
//        SaxionApp.saveImage("Exercise5/sample_output2.png");

    }

    public int defineSize(int minimum, int maximum){
        SaxionApp.print("Please, what size between " + minimum + " and "+ maximum + " do you want for your game: ");
        int size = SaxionApp.readInt();

        // if user entered a value too low or loo high, the size is adjusted to either the minimum or the maximum
        if (size <minimum) {
            return minimum;
        } else if (size > maximum) {
            return maximum;
        }

        return size;
    }

    public ArrayList<String> initializeGameboard(){
        // 9 variables for the characters to print, one for each position
        // create an ArrayList and initialize all positions with a numbner
        ArrayList<String> gameBoard = new ArrayList<String>();

        gameBoard.add("1");
        gameBoard.add("2");
        gameBoard.add("3");
        gameBoard.add("4");
        gameBoard.add("5");
        gameBoard.add("6");
        gameBoard.add("7");
        gameBoard.add("8");
        gameBoard.add("9");

        return gameBoard;
    }

    public int nextMove(String player){
        SaxionApp.print("Player " + player);
        SaxionApp.print(", what's your  move (1-9 and 0 for exit): ");

        return SaxionApp.readInt();
    }

    public boolean allFieldsFilled(ArrayList<String> gameBoard){
        for(String move: gameBoard){
            // One occurance of a field without X or O is enough to conclude that not all fields are filled.
            // return statement in the loop will end the loop
            if(!move.equals("X") && !move.equals("O")){
                return false;
            }
        }
        // if the whole ArrayList is checked and we still haven't left the method,
        // then it can be concluded that all fields are filled with X or O.
        return true;
    }

    public boolean checkWinner(String player, ArrayList<String> gameBoard){
        String winningSequence = player+player+player;

        // there are eight winning combinations:
        // 0,1,2
        // 3,4,5
        // 6,7,8
        // 0,3,6
        // 1,4,7
        // 2,5,8
        // 0,4,8
        // 2,4,6
        boolean weHaveAWinner = winningSequence.equals(gameBoard.get(0) + gameBoard.get(1) + gameBoard.get(2));

        if(!weHaveAWinner) {
            weHaveAWinner = winningSequence.equals(gameBoard.get(3) + gameBoard.get(4) + gameBoard.get(5));
        }

        if(!weHaveAWinner) {
            weHaveAWinner = winningSequence.equals(gameBoard.get(6) + gameBoard.get(7) + gameBoard.get(8));
        }

        if(!weHaveAWinner) {
            weHaveAWinner = winningSequence.equals(gameBoard.get(0) + gameBoard.get(3) + gameBoard.get(6));
        }

        if(!weHaveAWinner) {
            weHaveAWinner = winningSequence.equals(gameBoard.get(1) + gameBoard.get(4) + gameBoard.get(7));
        }

        if(!weHaveAWinner) {
            weHaveAWinner = winningSequence.equals(gameBoard.get(2) + gameBoard.get(5) + gameBoard.get(8));
        }

        if(!weHaveAWinner) {
            weHaveAWinner = winningSequence.equals(gameBoard.get(0) + gameBoard.get(4) + gameBoard.get(8));
        }

        if(!weHaveAWinner) {
            weHaveAWinner = winningSequence.equals(gameBoard.get(2) + gameBoard.get(4) + gameBoard.get(6));
        }

        return weHaveAWinner;
    }

    public void run() {

        int size = defineSize(50, 90);
        SaxionApp.clear();
        // Resize the frame to fit - We'll leave 2 "squares" on the left, right, top and bottom as padding..
        // (So the regular 3x3 field becomes a 7x7 field when drawn)
        SaxionApp.resize(7*size, 7*size);

        // first we initialize all positions with the numbner
        ArrayList<String> gameBoard = initializeGameboard();
        drawBoard(size, gameBoard);

        // In this code the player is a string that can be "X" or "O".
        // then later, player.equals is needed to find out who is the player.
        // printing the mark (X or O) is easy, just print player.
        // Another option is a boolean playerX (true of false).
        // then you don't need the equals. But you need an if-statement to print the right mark.
        String player = "X"; // always start with player X
        int move = nextMove(player);


        boolean gameOver = false;
        while(!gameOver){
            SaxionApp.clear();

            if(move > 0 && move<= gameBoard.size()){
                gameBoard.set(move-1, player);

                // move is made, change player
                if(player.equals("X")){
                    player = "O";
                } else {
                    player = "X";
                }

                // check in each round if game is over: a draw or winner X or winner O
                boolean allFieldsFilled = allFieldsFilled(gameBoard);
                boolean winnerX = checkWinner("X", gameBoard);
                boolean winnerY = checkWinner("O", gameBoard);
                gameOver = (winnerX || winnerY || allFieldsFilled);

                if(gameOver){
                    if(winnerX){
                        SaxionApp.printLine("Player X has won. Congratualions!");
                    } else if(winnerY){
                        SaxionApp.printLine("Player O has won. Congratualions!");
                    } else { // allFielsFilled
                        SaxionApp.printLine("It's a draw :(");
                    }
                } else {
                    // draw current status of the board
                    drawBoard(size, gameBoard);

                    // ask the current player for the next move
                    move = nextMove(player);
                }

            } else {
                // no move is made, so don't change player
                SaxionApp.printLine("Sorry, I didn't understand that input.");
                SaxionApp.printLine("Player " + player + ", please try again.");

                // draw current status of the board
                drawBoard(size, gameBoard);

                // ask the current player for the next move
                move = nextMove(player);
            }

            // draw current status of the board
            drawBoard(size, gameBoard);

        }
    }

}
