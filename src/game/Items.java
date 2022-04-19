package game;

public class Items {
    protected Rock rock;
    protected Paper paper;
    protected Scissors scissors;
    protected Spock spock;
    protected Lizard lizard;


    public Items() {

    }

    public Items(int choice) {
        this.rock = new Rock(false);
        this.paper = new Paper(false);
        this.scissors = new Scissors(false);
        this.spock = new Spock(false);
        this.lizard= new Lizard(false);

        switch (choice) {
            case 1 -> this.rock.setRock(true);
            case 2 -> this.paper.setPaper(true);
            case 3 -> this.scissors.setScissors(true);
            case 4 -> this.spock.setSpock(true);
            case 5 -> this.lizard.setLizard(true);
        }
    }

    public int whichIsTrue() {
        int result = 0;
        if (rock.isRock())
            result = 1;
        else if (paper.isPaper())
            result = 2;
        else if (scissors.isScissors())
            result = 3;
        else if (spock.isSpock())
            result = 4;
        else if (lizard.isLizard())
            result = 5;
        return result;
    }
    public Object whichItemTrue() {
        Object result=null;
        if (rock.isRock())
            result = rock;
        else if (paper.isPaper())
            result = paper;
        else if (scissors.isScissors())
            result = scissors;
        else if (spock.isSpock())
            result = spock;
        else if (lizard.isLizard())
            result = lizard;
        return result;
    }
    public void challenge(int choice){

        switch (choice) {
            case 1 -> rock.beat(this);
            case 2 -> paper.beat(this);
            case 3 -> scissors.beat(this);
            case 4 -> spock.beat(this);
            case 5 -> lizard.beat(this);
        }
    }

    @Override
    public String toString() {
        return "Items{" +
                "rock=" + rock.isRock() +
                ", paper=" + paper.isPaper() +
                ", scissors=" + scissors.isScissors() +
                ", spock=" + spock.isSpock() +
                ", lizard=" + lizard.isLizard() +
                '}';
    }


}
