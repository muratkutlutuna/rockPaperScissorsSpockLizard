package game;

import javax.swing.*;
import java.util.Random;

public class Methods {
    private Random random = new Random();
    private int choice, firstComputerChoice, secondComputerChoice, firstPlayerChoice, secondPlayerChoice;
    private String[] items = {"Rock", "Paper", "Scissors", "Spock", "Lizard"};
    private String winner;
    private Object firstPlayerItem, firstSideItem, playerItem;


    public void mainMenu() {

        JOptionPane.showMessageDialog(null, "Welcome to Rock Paper Scissors Spock Lizard Start!!\nIf you want to have fun, please push \"OK\"", "Greetings!!", JOptionPane.QUESTION_MESSAGE);

        playWithWho();

    }

    private void playWithWho() {
        String[] items = {"Play with computer", "Play with a player", "Play computer with himself"};

        choice = JOptionPane.showOptionDialog(new JFrame(), "How do you want to play?", "How To Play?", JOptionPane.DEFAULT_OPTION, 1, null, items, null);

        switch (choice) {
            case 0 -> playWithComputer();
            case 1 -> playWithAPlayer();
            case 2 -> playComputerWithHimself();
            case -1 -> {
            }
        }

    }

    private void playComputerWithHimself() {
        firstComputerChoice = random.nextInt(1, 6);
        Items play = new Items(firstComputerChoice);
        firstSideItem = play.whichItemTrue();
        JOptionPane.showMessageDialog(new JFrame(), "First Computer Choice is " + items[play.whichIsTrue() - 1], "First Side", JOptionPane.QUESTION_MESSAGE);
        secondComputerChoice = random.nextInt(1, 6);
        play.challenge(secondComputerChoice);
        JOptionPane.showMessageDialog(new JFrame(), "Second Computer Choice is " + items[secondComputerChoice - 1], "Second Side", JOptionPane.QUESTION_MESSAGE);
        if (firstComputerChoice == secondComputerChoice)
            winner = "== DRAW ==";
        else if (play.whichItemTrue() == firstSideItem)
            winner = "First side wins!!";
        else
            winner = "Second Side wins!!";
        String[] items = {"Let computer play again", "Go to main menu"};
        int choice = JOptionPane.showOptionDialog(new JFrame(), winner, "Results!!", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, items, null);
        switch (choice) {
            case 0 -> playComputerWithHimself();
            case 1 -> playWithWho();
            case -1 -> {
            }
        }
    }

    private void playWithAPlayer() {

        firstPlayerChoice = JOptionPane.showOptionDialog(new JFrame(), "Choose one; Rock, paper, Scissors, spock or lizard ?", "1st Player?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, items, null);
        Items play = new Items(firstPlayerChoice + 1);

        firstPlayerItem = play.whichItemTrue();
        secondPlayerChoice = JOptionPane.showOptionDialog(new JFrame(), "Choose one; Rock, paper, Scissors, spock or lizard ?", "2nd Player?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, items, null);
        play.challenge(secondPlayerChoice + 1);
        if (firstPlayerChoice == secondPlayerChoice)
            winner = "== DRAW ==";
        else if (play.whichItemTrue() == firstPlayerItem)
            winner = "First side wins!!";
        else
            winner = "Second Side wins!!";
        String[] items = {"Lets play again", "Go to main menu"};
        choice = JOptionPane.showOptionDialog(new JFrame(), winner, "Results!!", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, items, null);
        switch (choice) {
            case 0 -> playWithAPlayer();
            case 1 -> playWithWho();
            case -1 -> {
            }
        }

    }

    private void playWithComputer() {
        int playerChoice = JOptionPane.showOptionDialog(new JFrame(), "Rock, paper, Scissors, spock or lizard ?", "Which One?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, items, null);
        Items play = new Items(playerChoice + 1);
        playerItem = play.whichItemTrue();
        int computerChoice = random.nextInt(1, 6);
        JOptionPane.showMessageDialog(new JFrame(), "Computer Choice is " + items[computerChoice], "Computer Side", JOptionPane.PLAIN_MESSAGE, null);

        play.challenge(computerChoice);
        if (playerChoice == computerChoice)
            winner = "== DRAW ==";
        else if (play.whichItemTrue() == playerItem)
            winner = "Player wins!!";
        else
            winner = "Computer wins!!";
        String[] items = {"Lets play again", "Go to main menu"};
        int choice = JOptionPane.showOptionDialog(null, winner, "Results!!", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, items, null);
        switch (choice) {
            case 0 -> playWithComputer();
            case 1 -> playWithWho();
            case -1 -> {
            }
        }

    }


}
