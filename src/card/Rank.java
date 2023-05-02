package card;

public enum Rank {

    zero(0),one(1),two(2),three(3),four(4),five(5),six(6),seven(7),eight(8),nine(9)
    ,draw_2(20),skip(20),reverse(20),wild_draw_four(50),wild_choose_color(50);
    final int rank;

    Rank(int rank) {
        this.rank = rank;
    }

    public int getRank() {
        return rank;
    }

}
