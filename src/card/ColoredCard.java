package card;

public class ColoredCard extends Card{
    public  final Kleur kleur;

    public ColoredCard(Rang rang,Kleur kleur) {
        super(rang);
        this.kleur = kleur;
    }

    @Override
    public boolean isPlayabe(Card previousCard) {
        ColoredCard card=(ColoredCard) previousCard;
        return card.getRang()==rang||card.getKleur()==kleur;

    }

    public Kleur getKleur() {
        return kleur;
    }
}
