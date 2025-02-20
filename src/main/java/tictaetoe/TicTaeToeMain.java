package tictaetoe;

public class TicTaeToeMain {

    public static void main(String[] args) {
        TicTaeToeGame game = new TicTaeToeGame();
        System.out.println("Game winner is : " + game.startGame());
    }
}
