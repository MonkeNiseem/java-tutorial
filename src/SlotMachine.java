import java.util.Scanner;
import java.util.Random;

public class SlotMachine {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Welcome message
        System.out.println("*************************");
        System.out.println("  Welcome to Java Slots  ");
        System.out.println("Symbols: ❤️ ⭐ 🍒 🍄️ 🔱 ");
        System.out.println("**************************");

        // variables
        int amount_won;
        int bet_amount;
        int balance = 100;
        String[] symbols = {"❤️", "⭐", "🍒", "🍄", "🔱"};

        // start playing loop
        while (balance > 0){
            // print current balance
            System.out.println("Current balance: $" + balance);

            // choose bet amount
            while (true){
                System.out.print("Place your bet amount: ");
                bet_amount = scanner.nextInt();
                if (bet_amount > balance){
                    System.out.println("You can't bet that much!");
                    continue;
                }
                else if (bet_amount < 0){
                    System.out.println("You can't bet a negative number!");
                    continue;
                }
                break;
            }
            balance -= bet_amount;

            // spin random 3 symbols
            scanner.nextLine();
            System.out.println("Spinning...");
            int random1 = random.nextInt(5);
            int random2 = random.nextInt(5);
            int random3 = random.nextInt(5);
            System.out.println("***********");
            System.out.println(symbols[random1] + " | " + symbols[random2] + " | " + symbols[random3]);
            System.out.println("***********");

            // check to see result
            if (random1 == random2 && random2 == random3){
                amount_won = bet_amount * 10;
                balance += amount_won;
                System.out.println("You won $" + amount_won);
            }
            else if (random1 == random2 || random1 == random3 || random2 == random3){
                amount_won = bet_amount * 5;
                balance += amount_won;
                System.out.println("You won $" + amount_won);

            }
            else{
                System.out.println("Sorry you lost this round");
            }

            // check to play again
            if (balance < 0 || balance == 0){
                break;
            }
            System.out.print("Do you want to play again? (Y/N): ");
            String play_again = scanner.nextLine();
            if (play_again.equals("N") || play_again.equals("n")) {
                break;
            }
        }
        System.out.println("GAME OVER! Your final balance is $" + balance);


    }
}
