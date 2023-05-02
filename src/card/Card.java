package card;

public abstract class Card {
    public  final Rang rang;

    protected Card(Rang rang) {
        this.rang = rang;
    }

    public abstract boolean isPlayabe(Card previousCard);

    public Rang getRang() {
        return rang;
    }
}
