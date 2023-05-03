package Uno;

import Deck.Deck;
import card.Card;
import player.Player;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    final static int MAX_PLAYERS = 10;
    final static int MIN_PLAYERS = 2;
    ArrayList<Player> players;

    Player activePlayer;

    Deck deck;

    public Game(){
        players = new ArrayList<Player>();
        deck = new Deck();
        activePlayer = null;
    }

    public void setupPlayers(){
        System.out.println("Welcome to Uno! Made by Alexander, Alex, Kumait and Devon!");
        System.out.println("Let's add the players.");
        System.out.println("Type in a name and press enter, type continue to continue!");

        Scanner nameScanner = new Scanner(System.in);

        while(true){
            System.out.println("Name for player " +( players.size() + 1) + ": " );
            String name = nameScanner.nextLine();

            if(name.trim().equalsIgnoreCase("continue") && players.size() >= MIN_PLAYERS){
                break;
            }

            players.add(new Player(name));

            if(players.size() >= MAX_PLAYERS){
                break;
            }
        }

        activePlayer = players.get(0);
    }

    public void setupGame(){
        for (Player player: players) {
            for (int i = 0; i < 7; i ++){
                player.getHand().addCard(deck.draw());
            }
        }

        deck.playCard(deck.draw());
    }

    public void startGame(){
        clearScreen();
        System.out.println("Let the game begin!");
        while(true) {
            System.out.println("Current Player: " + activePlayer.getName());
            System.out.println("Your hand looks like: " + activePlayer.getHand().toString());
            System.out.println((activePlayer.getHand().getAllCardsInHand().size() + 1) + ") " + "Draw card..." ) ;
            System.out.println("The card on top is: " + deck.lastPlayedCard().toString());

            System.out.println();
            System.out.println("Choose between 1 and " + (activePlayer.getHand().getAllCardsInHand().size() + 1));

            int choice = 0;

            while(true) {
                System.out.print("Your choice: ");
                Scanner askInputScanner = new Scanner(System.in);

                choice = askInputScanner.nextInt();



                if(choice > 0 && choice <= activePlayer.getHand().getAllCardsInHand().size() + 1){
                    if(choice > activePlayer.getHand().getAllCardsInHand().size()){
                        Card drawnCard = deck.draw();
                        System.out.println("You have drawn " + drawnCard.toString());
                        activePlayer.getHand().getAllCardsInHand().add(drawnCard);
                        break;
                    }else if(deck.isValidPlay(activePlayer.getHand().getAllCardsInHand().get(choice - 1))) {
                        deck.playCard(activePlayer.getHand().getAllCardsInHand().get(choice - 1));
                        activePlayer.getHand().getAllCardsInHand().remove(choice - 1);
                        break;
                    }
                }
                System.out.println("Invalid choice, try again");
            }

            if(activePlayer.getHand().getAllCardsInHand().size() == 0){
                System.out.println("Congrats!! player " + activePlayer.getName() + " has won!");
                break;
            }


            nextPlayer();
            clearScreen();
        }

    }


    public void nextPlayer(){
        int currentActiveIndex = players.indexOf(activePlayer);

        if(currentActiveIndex != players.size() - 1) {
            activePlayer = players.get(currentActiveIndex + 1);
        }else {
            activePlayer = players.get(0);
        }
    }


    public void clearScreen(){
        for(int i = 0; i < 99; i++){
            System.out.println();
        }
    }

}
