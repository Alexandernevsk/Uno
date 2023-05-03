import Uno.Game;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();

        game.setupPlayers();
        game.setupGame();
        game.startGame();
    }
}