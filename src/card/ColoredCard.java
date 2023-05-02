package card;

public class ColoredCard extends Card{
    public  final Kleur kleur;

    public ColoredCard(Rank rank, Kleur kleur) {
        super(rank);
        this.kleur = kleur;
    }

    @Override
    public boolean isPlayabe(Card previousCard) {
        ColoredCard card=(ColoredCard) previousCard;
        return card.getRang()== rank ||card.getKleur()==kleur;

    }

    public Kleur getKleur() {
        return kleur;
    }
}
