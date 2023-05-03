package card;

import Uno.Game;

public enum Rank implements Pestable{

    zero(0){
        @Override
        public void execute(Game game) {}}
    ,one(1) {
        @Override
        public void execute(Game game) {
        }}
    ,two(2) {
        @Override
        public void execute(Game game) {}
    },three(3) {
        @Override
        public void execute(Game game) {}}
    ,four(4) {
        @Override public void execute(Game game) {}
    },five(5) {
        @Override
        public void execute(Game game) {}}
    ,six(6) {
        @Override
        public void execute(Game game) {}}
    ,seven(7) {
        @Override
        public void execute(Game game) {}}
    ,eight(8) {
        @Override
        public void execute(Game game) {}}
    ,nine(9) {
        @Override
        public void execute(Game game) {}}
    ,draw_2(20) {
        @Override
        public void execute(Game game) {
            game.moveTurn();
            game.makeDraw();
            game.makeDraw();
        }
    },skip(20) {
        @Override
        public void execute(Game game) {
            game.moveTurn();
        }
    },reverse(20) {
        @Override
        public void execute(Game game) {
            game.switchDirection();
        }
    },wild_draw_four(50) {
        @Override
        public void execute(Game game) {
            game.moveTurn();
            game.makeDraw();
            game.makeDraw();
            game.makeDraw();
            game.makeDraw();
        }
    },wild_choose_color(50) {
        @Override
        public void execute(Game game) {

        }
    };
    final int rank;

    Rank(int rank) {
        this.rank = rank;
    }

    public int getRank() {
        return rank;
    }
}
