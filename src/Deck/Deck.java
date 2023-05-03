package Deck;

import card.*;
import card.Color;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    ArrayList<Card> drawPile;
    ArrayList<Card> discardPile;

//    public static void main(String[] args) {
//        Deck deck = new Deck();
//        deck.createDeck();
//        deck.shuffle();
//        System.out.println(deck.drawPile);
//        System.out.println(deck.drawPile.size());
//    }


    public Deck() {
        createDeck();
        shuffle();
        discardPile = new ArrayList<>();
    }


    public void createDeck() {
        drawPile = new ArrayList<>();
        for(Rank rank : Rank.values()){
            for(Color color: Color.values()){
                if(rank.getRank() < 50) {
                    drawPile.add(new ColoredCard(rank, color));
                    if(rank.getRank() != 0) {
                        drawPile.add(new ColoredCard(rank, color));
                    }
                }else drawPile.add(new SpecialCard(rank));
            }
        }
    }

    public boolean isValidPlay(Card card){
        return card.isPlayabe(lastPlayedCard());
    }

    public Card draw (){
        Card card = drawPile.get(0);
        drawPile.remove(0);

        if(drawPile.isEmpty()) {
            reshuffle();
        }

        return card;
    }

    public void shuffle() {
        Collections.shuffle(drawPile);
    }

    public void setDrawPile(ArrayList<Card> drawPile) {
        this.drawPile = drawPile;

    }
    private void reshuffle (){
        drawPile = discardPile;
        shuffle();
    }

    public ArrayList<Card> getDrawPile() {
        return drawPile;
    }

    public Card lastPlayedCard() {
        return discardPile.get(discardPile.size()-1);
    }

    //Play a card by adding it to the discard pile.
    public void playCard(Card card) {
        discardPile.add(card);
    }
}
