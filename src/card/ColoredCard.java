package card;

public class ColoredCard extends Card{
    public  final Color color;

    public ColoredCard(Rank rank, Color color) {
        super(rank);
        this.color = color;
    }

    @Override
    public boolean isPlayabe(Card previousCard) {
        ColoredCard card=(ColoredCard) previousCard;
        return card.getRank()== rank ||card.getColor()== color;

    }

    public Color getColor() {
        return color;
    }
}
