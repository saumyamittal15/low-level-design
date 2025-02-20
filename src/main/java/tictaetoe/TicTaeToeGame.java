package tictaetoe;

import tictaetoe.model.*;

import java.util.*;

public class TicTaeToeGame {
    Deque<Player> players;
    Board game;

    TicTaeToeGame(){
        initializeGame();
    }

    private void initializeGame() {
        players = new LinkedList<>();
        PlayingPieceX crossPiece = new PlayingPieceX();
        Player player1 = new Player("player1", crossPiece);

        PlayingPieceO zeroPiece = new PlayingPieceO();
        Player player2 = new Player("player2", zeroPiece);

        players.add(player1);
        players.add(player2);

        game = new Board(3);
    }


    public String startGame() {
        boolean noWinner = true;
        while(noWinner){
            Player playerTurn = players.removeFirst();

            game.printBoard();

            List<AbstractMap.SimpleEntry<Integer, Integer>> freeSpaces = game.getFreeCells();
            if(freeSpaces.isEmpty()){
                noWinner = false;
                continue;
            }

            System.out.println("Player : " + playerTurn.name + "Enter row, column : ");
            Scanner inputScanner = new Scanner(System.in);
            String s = inputScanner.nextLine();
            String[] values = s.split(",");
            int inputRow = Integer.parseInt(values[0]);
            int inputColumn = Integer.parseInt(values[1]);

            boolean pieceAddedSuccess = game.addPiece(inputRow, inputColumn, playerTurn.playingPiece);
            if(!pieceAddedSuccess){
                System.out.println("Incorrect position chosen, try again");
                players.addFirst(playerTurn);
                continue;
            }
            players.addLast(playerTurn);

            boolean winner = isThereWinner(inputRow, inputColumn, playerTurn.playingPiece.pieceType);
            if(winner){
                return playerTurn.name;
            }
        }

        return "tie";
    }

    private boolean isThereWinner(int inputRow, int inputColumn, PieceType pieceType) {
        //add logic for n-queen
        return true;
    }
}
