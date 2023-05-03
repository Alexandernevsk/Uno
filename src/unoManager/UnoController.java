package unoManager;

import Deck.Deck;
import player.Player;

public class UnoController {

    private  boolean moveDirection;

    Player[] players;

    int currentPlayer;
     Deck deck;

     public void moveTurn(){
         currentPlayer+=moveDirection?1:-1;

         if(currentPlayer<0){currentPlayer=players.length-1;}
         else if(currentPlayer>=players.length){currentPlayer=0;}
     }
     public void playerTurn(){
         // TODO: 03/05/2023
         /*
         first step: player chooses {Card} card controller evaluates :
         if card is valid input move on to second step >>
         else if player has no valid cards? : player.drawCard return current turn
         else back to first step <<
         player removes card from his has this and adds it to this.deck.discardpile[0];
         execute function on card.Rank and set lastCard=card;

          */
     }
     public  Player getActivePlayer(){return  players[currentPlayer];}
    public void switchDirection(){moveDirection=!moveDirection;}
    public void checkSymbol(){

    }
    public  void makeDraw(){players[currentPlayer].getHand().addCard(deck.draw());}




}
