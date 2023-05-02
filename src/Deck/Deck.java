package Deck;

import card.*;
import card.Color;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    ArrayList<Card> drawPile;
    ArrayList<Card> discardPile;

    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.createDeck();
        System.out.println(deck.drawPile);
        System.out.println(deck.drawPile.size());
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

    public Card draw (){
        Card card = drawPile.get(0);
        drawPile.remove(0);
        return card;
    }

    public void shuffle() {
        Collections.shuffle(drawPile);
    }

    public void setDrawPile(ArrayList<Card> drawPile) {
        this.drawPile = drawPile;

    }
    public void reshuffle (){
        drawPile = discardPile;
        shuffle();
    }

    public ArrayList<Card> getDrawPile() {
        return drawPile;
    }

    public ArrayList<Card> getDiscardPile() {
        return discardPile;
    }

    public void setDiscardPile(Card card) {
        discardPile.add(card);
    }
}
