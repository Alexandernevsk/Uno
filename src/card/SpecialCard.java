package card;

public class SpecialCard extends Card{
    protected SpecialCard(Rank rank) {
        super(rank);
    }

    @Override
    public boolean isPlayabe(Card previousCard) {
        return true;
    }
}
