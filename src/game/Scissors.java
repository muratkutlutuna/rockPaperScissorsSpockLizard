package game;

public class Scissors extends Items implements ItemsBehavior {
    private boolean scissors;

    public Scissors(boolean scissors) {
        this.scissors = scissors;
    }


    public boolean isScissors() {
        return scissors;
    }

    public void setScissors(boolean scissors) {
        this.scissors = scissors;
    }

    @Override
    public void beat(Items items) {
        items.paper.setPaper(false);
        items.lizard.setLizard(false);

    }
}
