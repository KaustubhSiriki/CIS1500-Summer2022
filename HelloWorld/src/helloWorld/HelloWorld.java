package helloWorld;

import java.util.Scanner;
import java.util.Random;

public class HelloWorld {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        while (true) {
            String[] rpsls = {"r", "p", "sc", "l", "sp"};
            String computerFighter = rpsls[new Random().nextInt(rpsls.length)];
            String playerFighter;

            while (true) {
                System.out.println("Welcome to the amazing game Rock(r), Paper(p), Scissors(sc), Lizard(l), Spock(sp), Please chose your fighter.");
                playerFighter = keyboard.nextLine();
                if (playerFighter.equals("r") || playerFighter.equals("p") || playerFighter.equals("sc") || playerFighter.equals("l") || playerFighter.equals("sp")) {
                    break;
                }
                System.out.println(playerFighter + " Not available, please chose from selected choices!");
            }
            System.out.println("Computer fighter was " + computerFighter);

            if (playerFighter.equals(computerFighter)) {
                System.out.println("There is a tie!");
            } else if (playerFighter.equals("r")) {
                if (computerFighter.equals("p")) {
                    System.out.println("Paper covers rock, player loses, computer wins!");
                } else if (computerFighter.equals("sp")) {
                    System.out.println("Spock vaporizes rock, player loses, computer wins!");
                } else if (computerFighter.equals("l")) {
                    System.out.println("Rock crushes lizard, player wins, computer loses!");
                } else if (computerFighter.equals("sc")) {
                    System.out.println("Rock crushes scissors, player wins, computer loses!");
                }
            } else if (playerFighter.equals("p")) {
                if (computerFighter.equals("sc")) {
                    System.out.println("Scissors cut paper, player loses, computer wins!");
                } else if (computerFighter.equals("l")) {
                    System.out.println("Lizard eats paper, player loses, computer wins!");
                } else if (computerFighter.equals("r")) {
                    System.out.println("Paper covers rock, player wins, computer loses!");
                } else if (computerFighter.equals("sp")) {
                    System.out.println("Paper disproves spock, player wins, computer loses!");
                }
            } else if (playerFighter.equals("sc")) {
                if (computerFighter.equals("r")) {
                    System.out.println("Rock crushes scissors, player loses, computer wins!");
                } else if (computerFighter.equals("sp")) {
                    System.out.println("Spock crushes scissors, player loses, computer wins!");
                } else if (computerFighter.equals("p")) {
                    System.out.println("Scissors cut paper, player wins, computer loses!");
                } else if (computerFighter.equals("l")) {
                    System.out.println("Scissors decapitates lizard, player wins, computer loses!");
                }
            } else if (playerFighter.equals("l")) {
                if (computerFighter.equals("sc")) {
                    System.out.println("Scissors decapitates lizard, player loses, computer wins!");
                } else if (computerFighter.equals("r")) {
                    System.out.println("Rock crushes lizard, player loses, computer wins!");
                } else if (computerFighter.equals("sp")) {
                    System.out.println("Lizard poisons spock, player wins, computer loses!");
                } else if (computerFighter.equals("p")) {
                    System.out.println("Lizard eats paper, player wins, computer loses!");
                }
            } else if (playerFighter.equals("sp")) {
                if (computerFighter.equals("p")) {
                    System.out.println("Paper disproves spock, player loses, computer wins!");
                } else if (computerFighter.equals("l")) {
                    System.out.println("Lizard poisons spock, player loses, computer wins!");
                } else if (computerFighter.equals("r")) {
                    System.out.println("Spock vaporizes rock, player wins, computer loses!");
                } else if (computerFighter.equals("sc")) {
                    System.out.println("Spock crushes scissors, player wins, computer loses!");
                }
            }

            System.out.println("Would you like to play again? (y/n)");
            String playAgain = keyboard.nextLine();
            if (!playAgain.equals("y")) {
                break;
            }
        }

    }
}
