import java.text.NumberFormat;
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

        double avg = (num1 + num2 + num3 + num4 + num5) / 5.0;

        double min = num1;

        if (num2 < min){
            min = num2;
        }
        if (num3 < min){
            min = num3;
        }
        if (num4 < min){
            min = num4;
        }
        if (num5 < min){
            min = num5;
        }

        double max = num1;

        if (num2 > max){
            max = num2;
        }
        if (num3 > max){
            max = num3;
        }
        if (num4 > max){
            max = num4;
        }
        if (num5 > max){
            max = num5;
        }

        double stand_dev = Math.sqrt((Math.pow(avg - num1, 2) + Math.pow(avg - num2, 2) + Math.pow(avg - num3, 2) + Math.pow(avg - num4, 2) + Math.pow(avg - num5, 2)) / 5);

        NumberFormat numberFormat = NumberFormat.getNumberInstance();
        numberFormat.setMaximumFractionDigits(3);

        String avg_round = numberFormat.format(avg);
        String dev_round = numberFormat.format(stand_dev);

        System.out.println("Min: " + min + ", Max: " + max + ", Avg: " + avg_round + ", Standard Dev: " + dev_round);
    }

}