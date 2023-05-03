package player;

import card.Card;

import java.util.ArrayList;

public class Hand {

    ArrayList<Card> cards;

    public Hand(){
        cards = new ArrayList<>();
    }

    public Hand(ArrayList<Card> cards){
        this.cards = cards;
    }

    public ArrayList<Card> getAllCardsInHand(){
        return cards;
    }

    public void addCard(Card card){
        cards.add(card);
    }

    @Override
    public String toString(){
        String result = "";

        for (Card card : cards){
            result += "\n "+(cards.indexOf(card) + 1)+") " + card.toString() + "";
        }


        return result;
    }


}
