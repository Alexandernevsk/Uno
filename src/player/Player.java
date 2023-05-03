package player;

import card.Card;
import card.Rank;
import java.util.ArrayList;

public class Player {
    private String name;
    private Hand hand;

    public Player(String name){
        this.name = name;
        this.hand = new Hand();
    }

    public Player(String name, Hand hand){
        this.name = name;
        this.hand = hand;
    }

    public Hand getHand(){
        return hand;
    }

    public String getName(){
        return name;
    }

//    public void playCard(Card card){
//        cards.remove(card);
//
//    }
//    public void addCard(Card card){
//        cards.add(card);
//    }
//    //Editable placeholder choose method for choosing card from player's hand.
//    public Card chooseCard(int choose) {
//        if (choose < cards.size() && choose >= 0) {
//            return cards.get(choose);
//        }else throw new IllegalArgumentException("Invalid input");
//    }


}
