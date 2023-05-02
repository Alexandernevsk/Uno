package card;

public abstract class Card {
    public  final Kleur kleur;
    public Card(Kleur kleur) {
        this.kleur = kleur;
    }
    public abstract boolean isPlayabe(Card previousCard);
}
