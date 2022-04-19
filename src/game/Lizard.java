package game;

public class Lizard extends Items implements ItemsBehavior {
    private boolean lizard;

    public Lizard(boolean lizard) {
        this.lizard = lizard;
    }

    public boolean isLizard() {
        return lizard;
    }

    public void setLizard(boolean lizard) {
        this.lizard = lizard;
    }

    @Override
    public void beat(Items items) {
        items.spock.setSpock(false);
        items.paper.setPaper(false);
    }
}
