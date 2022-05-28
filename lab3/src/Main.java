import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter Number 1: ");
        double num1 = Double.parseDouble(keyboard.nextLine());

        System.out.println("Enter Number 2: ");
        double num2 = Double.parseDouble(keyboard.nextLine());

        System.out.println("Enter Number 3: ");
        double num3 = Double.parseDouble(keyboard.nextLine());

        System.out.println("Enter Number 4: ");
        double num4 = Double.parseDouble(keyboard.nextLine());

        System.out.println("Enter Number 5: ");
        double num5 = Double.parseDouble(keyboard.nextLine());

        double avg = (num1 + num2 + num3 + num4 + num5) / 5;
        
    }
}