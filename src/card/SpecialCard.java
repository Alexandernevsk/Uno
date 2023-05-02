package card;

public class SpecialCard extends Card{
    protected SpecialCard(Rang rang) {
        super(rang);
    }

    @Override
    public boolean isPlayabe(Card previousCard) {
        return true;
    }
}
