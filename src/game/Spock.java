package game;

public class Spock extends Items implements ItemsBehavior {
    private boolean spock;

    public Spock(boolean spock) {
        this.spock = spock;
    }

    public boolean isSpock() {
        return spock;
    }

    public void setSpock(boolean spock) {
        this.spock = spock;
    }

    @Override
    public void beat(Items items) {
        items.scissors.setScissors(false);
        items.rock.setRock(false);

    }
}
