import java.util.Scanner;

public class BankingProgram {

    static double balance = 0;

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int response;

        while(true) {
            startingText();
            response = scanner.nextInt();
            if (response == 1){
                showBalance(balance);
            }
            else if (response == 2){
                System.out.print("Enter an amount to be deposited: ");
                double depositAmount = scanner.nextDouble();
                deposit(depositAmount);
            }
            else if (response == 3){
                System.out.print("Enter amount to be withdrawn: ");
                double withdrawAmount = scanner.nextDouble();
                withdraw(withdrawAmount);
            }
            else if (response == 4){
                System.out.println("Goodbye!");
                break;
            }
            else{
                System.out.println("That isn't a choice!");
            }
        }

        scanner.close();
    }

    static void startingText(){
        System.out.println("***************");
        System.out.println("BANKING PROGRAM");
        System.out.println("***************");
        System.out.println("1. Show Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        System.out.println("***************");
        System.out.print("Enter your choice (1-4): ");
    }

    static void showBalance(double balance){
        System.out.println("***************");
        System.out.printf("$%.2f\n", balance);
    }

    static void deposit(double depositAmount){
        if (depositAmount < 0){
            System.out.println("You can't deposit a negative amount!");
        }
        else if (depositAmount > 0){
            balance += depositAmount;
            System.out.println("test");
        }
    }

    static void withdraw(double withdrawAmount){
        if ((balance - withdrawAmount) < 0){
            System.out.println("You can't withdraw that much!");
        }
        else if ((balance - withdrawAmount) > 0){
            balance -= withdrawAmount;
        }
    }
}
