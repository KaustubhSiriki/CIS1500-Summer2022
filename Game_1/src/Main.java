import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Hi, what's your name?");
        String name = keyboard.nextLine();
        System.out.println("Hey " + name + ", wanna join me in a game of rock, paper, scissors, lizard, and spock? \n- Play \n- Exit");
        String menu_option = keyboard.nextLine();
        String [] plays = {"Rock", "Paper", "Scissors", "Lizard", "Spock"};
        String computer = plays[(int)(Math.random() * 5)];

        while (menu_option.equalsIgnoreCase("play")){
            System.out.println("You'll play the computer!");
            System.out.println("Select an option: \n- Rock \n- Paper \n- Scissors \n- Lizard \n- Spock");
            String player = keyboard.nextLine();

            while (!(player.equalsIgnoreCase("Rock") || player.equalsIgnoreCase("Paper") || player.equalsIgnoreCase("Scissors") || player.equalsIgnoreCase("Lizard") || player.equalsIgnoreCase("Spock"))){
                System.out.println("ERROR: Please type in an option!");
                player = keyboard.nextLine();
            }

            System.out.println("Computer: " + computer + "\nYou: " + player);

            if (player.equalsIgnoreCase("Rock") && (computer.equalsIgnoreCase("Paper") || computer.equalsIgnoreCase("Spock"))) {
                System.out.println("You Lose!");
            } else if (player.equalsIgnoreCase("Rock") && (computer.equalsIgnoreCase("Scissors") || computer.equalsIgnoreCase("Lizard"))) {
                System.out.println("You Win!");
            } else if (player.equalsIgnoreCase("Paper") && (computer.equalsIgnoreCase("Scissors") || computer.equalsIgnoreCase("Lizard"))) {
                System.out.println("You Lose!");
            } else if (player.equalsIgnoreCase("Paper") && (computer.equalsIgnoreCase("Rock") || computer.equalsIgnoreCase("Spock"))) {
                System.out.println("You Win!");
            } else if (player.equalsIgnoreCase("Scissors") && (computer.equalsIgnoreCase("Rock") || computer.equalsIgnoreCase("Spock"))) {
                System.out.println("You Lose!");
            } else if (player.equalsIgnoreCase("Scissors") && (computer.equalsIgnoreCase("Paper") || computer.equalsIgnoreCase("Lizard"))) {
                System.out.println("You Win!");
            } else if (player.equalsIgnoreCase("Spock") && (computer.equalsIgnoreCase("Paper") || computer.equalsIgnoreCase("Lizard"))) {
                System.out.println("You Lose!");
            } else if (player.equalsIgnoreCase("Spock") && (computer.equalsIgnoreCase("Scissors") || computer.equalsIgnoreCase("Rock"))) {
                System.out.println("You Win!");
            } else if (player.equalsIgnoreCase("Lizard") && (computer.equalsIgnoreCase("Scissors") || computer.equalsIgnoreCase("Rock"))) {
                System.out.println("You Lose!");
            } else if (player.equalsIgnoreCase("Lizard") && (computer.equalsIgnoreCase("Paper") || computer.equalsIgnoreCase("Spock"))) {
                System.out.println("You Win!");
            } else {
                System.out.println("You Tied!");
            }

            while (menu_option.equalsIgnoreCase("play")){
                System.out.println("Game Over! Would you like to play again, " + name + "? \n- Play \n- Exit");
                menu_option = keyboard.nextLine();
            }

        }
    }
}