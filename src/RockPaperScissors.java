import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean play_again = true;
        int total_wins = 0;

        while (play_again){
            System.out.print("Enter your move (rock, paper, scissors): ");
            String user_move = scanner.nextLine();
            if (!user_move.equals("rock") && (!user_move.equals("paper") && (!user_move.equals("scissors")))){
                System.out.println("Invalid choice");
                continue;
            }

            String[] choices = {"rock", "paper", "scissors"};
            int randomNumber = random.nextInt(0, 3);
            String computer_choice = choices[randomNumber];
            System.out.println("Computer choice: " + computer_choice);

            if (user_move.equals("rock")){
                if (computer_choice.equals("rock")){
                    System.out.println("Tie!");
                }
                else if (computer_choice.equals("paper")){
                    System.out.println("Computer wins!");
                }
                else{
                    System.out.println("You win!");
                    total_wins++;
                }
            }
            else if (user_move.equals("paper")){
                if (computer_choice.equals("rock")){
                    System.out.println("You win!");
                    total_wins++;
                }
                else if (computer_choice.equals("paper")){
                    System.out.println("Tie!");
                }
                else{
                    System.out.println("Computer wins!");
                }
            }
            else{
                if (computer_choice.equals("rock")){
                    System.out.println("Computer wins!");
                }
                else if (computer_choice.equals("paper")){
                    System.out.println("You win!");
                    total_wins++;
                }
                else{
                    System.out.println("Tie!");
                }
            }

            System.out.print("Play again? (yes/no): ");
            String user_play_again = scanner.nextLine();
            if (user_play_again.equals("no")){
                play_again = false;
            }
        }

        System.out.println("You won " + total_wins + " time(s)");

        scanner.close();

    }
}
