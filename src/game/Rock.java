package game;

public class Rock extends Items implements ItemsBehavior {
    private boolean rock;

    public Rock(boolean rock) {
        this.rock = rock;
    }

    public boolean isRock() {
        return rock;
    }

    public void setRock(boolean rock) {
        this.rock = rock;
    }

    @Override
    public void beat(Items items) {
        items.lizard.setLizard(false);
        items.scissors.setScissors(false);
    }


}
