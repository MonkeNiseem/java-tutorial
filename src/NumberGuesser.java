import java.util.Scanner;
import java.util.Random;

public class NumberGuesser {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Number Guessing Game");
        System.out.println("Guess a number between 1-100");

        int userNumber;
        int randomNumber = random.nextInt(1, 101);
        int attempts = 0;

        System.out.print("Enter a guess: ");
        userNumber = scanner.nextInt();

        do{
            attempts++;
            if(userNumber > randomNumber){
                System.out.println("TOO HIGH! Try again");
                System.out.print("Enter a guess: ");
                userNumber = scanner.nextInt();
            }
            else if(userNumber < randomNumber) {
                System.out.println("TOO LOW! Try again");
                System.out.print("Enter a guess: ");
                userNumber = scanner.nextInt();
            }
        } while (userNumber != randomNumber);

        System.out.println("YOU GOT IT!!");
        System.out.println("It took you " + attempts + " attempt(s).");

        scanner.close();
    }
}
