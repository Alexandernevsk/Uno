package Deck;

import card.*;
import card.Color;

import java.awt.*;
import java.util.ArrayList;

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

}
