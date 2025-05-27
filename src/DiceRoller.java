import java.util.Scanner;
import java.util.Random;

public class DiceRoller {
    public static void main(String[] args){

        // Make scanner and random instances
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Declare total variable
        int total = 0;

        // Dices
        String dice1 = """
         -------
        |       |
        |   ●   |
        |       |
         -------
        """;

        String dice2 = """
         -------
        | ●     |
        |       |
        |     ● |
         -------
        """;

        String dice3 = """
         -------
        | ●     |
        |   ●   |
        |     ● |
         -------
        """;

        String dice4 = """
         -------
        | ●   ● |
        |       |
        | ●   ● |
         -------
        """;

        String dice5 = """
         -------
        | ●   ● |
        |   ●   |
        | ●   ● |
         -------
        """;

        String dice6 = """
         -------
        | ●   ● |
        | ●   ● |
        | ●   ● |
         -------
        """;

        // Ask for user input on how many times he wants to roll the dice
        System.out.print("Enter the number of dice to roll: ");
        int amount = scanner.nextInt();

        // Check if the user input is valid
        if(amount > 0){
            System.out.println("Rolling " + amount + " dice...");
            // Make a for loop
            for (int i = 0; i < amount; i++){
                int number = random.nextInt(1, 7);
                total += number;
                switch (number){
                    case 1 -> System.out.print(dice1);
                    case 2 -> System.out.print(dice2);
                    case 3 -> System.out.print(dice3);
                    case 4 -> System.out.print(dice4);
                    case 5 -> System.out.print(dice5);
                    case 6 -> System.out.print(dice6);
                }
                System.out.println("You rolled: " + number);
            }

            // Print total
            System.out.println("Total of all rolls: " + total);
        }
        else{
            System.out.println("That isn't a valid number!");
        }

        // Close scanner
        scanner.close();
    }
}
