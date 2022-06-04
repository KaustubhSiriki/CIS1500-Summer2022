package helloWorld;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        String playAgain = "y";
        while (playAgain.equals("y")) {
            System.out.println("Enter your move. Pick rock, paper, scissors, lizard, or spock: ");


            //(validation loop) asking player for their move and making sure it is valid
            String playerChoice = "";
            playerChoice = keyboard.nextLine();
            while (!playerChoice.equalsIgnoreCase("rock") &&
                    !playerChoice.equalsIgnoreCase("paper") &&
                    !playerChoice.equalsIgnoreCase("scissors") &&
                    !playerChoice.equalsIgnoreCase("lizard") &&
                    !playerChoice.equalsIgnoreCase("spock")) {
                playerChoice = keyboard.nextLine();
                System.out.println("Enter your move. Pick rock, paper, scissors, lizard, or spock: ");
            }

            int randomNumber1To5 = (int) (Math.random() * 2 + 1);
            String computerChoice = "";
            if (randomNumber1To5 == 1) {
                computerChoice = "rock";
            } else if (randomNumber1To5 == 2) {
                computerChoice = "paper";
            } else if (randomNumber1To5 == 3) {
                computerChoice = "scissors";
            } else if (randomNumber1To5 == 4) {
                computerChoice = "lizard";
            } else {
                computerChoice = "spock";
            }

            System.out.println("Player's move: " + playerChoice);
            System.out.println("Computer's move: " + computerChoice);

            if (playerChoice.equals(computerChoice)) {
                System.out.println("It is a tie!");
            } else if ((playerChoice.equals("rock")) && (computerChoice.equals("scissors")) ||
                    playerChoice.equals("rock") && computerChoice.equals("lizard") ||
                    playerChoice.equals("paper") && computerChoice.equals("rock") ||
                    playerChoice.equals("paper") && computerChoice.equals("spock") ||
                    playerChoice.equals("scissors") && computerChoice.equals("paper") ||
                    playerChoice.equals("scissors") && computerChoice.equals("lizard") ||
                    playerChoice.equals("lizard") && computerChoice.equals("paper") ||
                    playerChoice.equals("lizard") && computerChoice.equals("spock") ||
                    playerChoice.equals("spock") && computerChoice.equals("rock") ||
                    playerChoice.equals("Spock") && computerChoice.equals("scissors")) {
                System.out.println("You win!");
            } else {
                System.out.println("Sorry, you lose.");
            }
            playAgain = "n";

            while (playAgain.equalsIgnoreCase("n")) {
                System.out.println("Do you want to play again? (y/n)");
                playAgain = keyboard.nextLine();
            }
            }

    }
}
