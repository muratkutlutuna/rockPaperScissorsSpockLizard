package game;

public class Paper extends Items implements ItemsBehavior {
    private boolean paper;

    public Paper(boolean paper) {
        this.paper = paper;
    }

    public boolean isPaper() {
        return paper;
    }

    public void setPaper(boolean paper) {
        this.paper = paper;
    }

    @Override
    public void beat(Items items) {
        items.rock.setRock(false);
        items.spock.setSpock(false);
    }
}
