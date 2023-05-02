package card;

public class SpecialCard extends Card{
    public SpecialCard(Rank rank) {
        super(rank);
    }

    @Override
    public boolean isPlayabe(Card previousCard) {
        return true;
    }

    @Override
    public String toString() {
        return rank.toString();
    }
}
