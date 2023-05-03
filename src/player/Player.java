package player;

import card.Card;
import card.Rank;
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
    //Editable placeholder choose method for choosing card from player's hand.
    public Card chooseCard(int choose) {
        if (choose < cards.size() && choose >= 0) {
            return cards.get(choose);
        }else throw new IllegalArgumentException("Invalid input");
    }


}
