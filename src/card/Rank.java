package card;

import unoManager.UnoController;

public enum Rank implements Pestable{

    zero(0){
        @Override
        public void execute(UnoController controller) {

        }
    },one(1) {
        @Override
        public void execute(UnoController controller) {

        }
    },two(2) {
        @Override
        public void execute(UnoController controller) {

        }
    },three(3) {
        @Override
        public void execute(UnoController controller) {

        }
    },four(4) {
        @Override public void execute(UnoController controller) {

        }
    },five(5) {
        @Override
        public void execute(UnoController controller) {}
    },six(6) {
        @Override
        public void execute(UnoController controller) {}
    },seven(7) {
        @Override
        public void execute(UnoController controller) {}
    },eight(8) {
        @Override
        public void execute(UnoController controller) {}
    },nine(9) {
        @Override
        public void execute(UnoController controller) {}
    },draw_2(20) {
        @Override
        public void execute(UnoController controller) {
            controller.moveTurn();
        }
    },skip(20) {
        @Override
        public void execute(UnoController controller) {
            controller.moveTurn();
        }
    },reverse(20) {
        @Override
        public void execute(UnoController controller) {
            controller.switchDirection();
        }
    },wild_draw_four(50) {
        @Override
        public void execute(UnoController controller) {
            controller.moveTurn();

        }
    },wild_choose_color(50) {
        @Override
        public void execute(UnoController controller) {

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
