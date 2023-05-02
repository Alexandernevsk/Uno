package unoManager;

import Deck.Deck;
import player.Player;

import java.util.ArrayList;

public class UnoController {

    private  boolean moveDirection;

    Player[] players;

    int currentPlayer;
     Deck deck;

     public  void moveTurn(){
         currentPlayer+=moveDirection?1:-1;

         if(currentPlayer<0){currentPlayer=players.length-1;}
         else if(currentPlayer>=players.length){currentPlayer=0;}
     }
     public  Player getActivePlayer(){return  players[currentPlayer];}
    public void switchDirection(){moveDirection=!moveDirection;}
}
