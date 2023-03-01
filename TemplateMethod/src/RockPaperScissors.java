import java.util.Random;
import java.util.Scanner;

class RockPaperScissors extends Game {

    private int[] scores;
    private String[] options;
    private Random random;
    private int computerChoice;
    private int playerOne;
    void initializeGame() {
        scores = new int[playersCount];
        options = new String[]{"Rock", "Paper", "Scissors"};
        random = new Random();
        System.out.println("Let's play Rock Paper Scissors!");
    }

    void makePlay(int player) {
        Scanner scanner = new Scanner(System.in);
        if (player == 0) {
        	playerOne = random.nextInt(options.length);
            System.out.println("Player 1 chose: " + options[playerOne]);
        }
         else {
            computerChoice = random.nextInt(options.length);
            System.out.println("Player 2 chose " + options[computerChoice]);
        }
        if(player == 1) {
        if (playerOne == computerChoice) {
            System.out.println("It's a tie!");
        } 
        else if ((playerOne == 0 && computerChoice == 2) ||
                   (playerOne == 1 && computerChoice == 0) ||
                   (playerOne == 2 && computerChoice == 1)) {
            System.out.println("Player 1 wins!");
            scores[0]++;
            System.out.println("Current score: Player 1 - " + scores[0] + ", Player 2 - " + scores[1]);
        } else {
            System.out.println("Player 2 wins!");
            scores[1]++;
            System.out.println("Current score: Player 1 - " + scores[0] + ", Player 2 - " + scores[1]);
        }
        }
    }

    boolean endOfGame() {
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == 2) {
                return true;
            }
        }
        return false;
    }

    void printWinner() {
        int winner = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == 2) {
                winner = i;
            }
        }
        System.out.println("Player " + (winner + 1) + " wins the game!");
    }
}