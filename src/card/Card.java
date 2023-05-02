package card;

public abstract class Card {
    public  final Rank rank;

    protected Card(Rank rank) {
        this.rank = rank;
    }

    public abstract boolean isPlayabe(Card previousCard);

    public Rank getRang() {
        return rank;
    }
}
