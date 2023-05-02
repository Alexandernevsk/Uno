package player;

import card.Card;

import java.util.ArrayList;

public class Player {
    final ArrayList<Card>cards;

    public Player(ArrayList<Card> cards) {
        this.cards = cards;
    }
    public void playCard(Card card){
        cards.remove(card);
    }
    public void addCard(Card card){
        cards.add(card);
    }
}
