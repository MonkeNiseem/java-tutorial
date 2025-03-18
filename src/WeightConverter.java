import java.util.Scanner;

public class WeightConverter {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Welcome message
        System.out.println("Weight Conversion Program");
        System.out.println("1: Convert lbs to kgs\n2: Convert kgs to lbs");

        // Option
        System.out.print("Choose an option: ");
        int option = scanner.nextInt();

        // Weight
        if (option == 1){
            System.out.print("Enter the weight in lbs: ");
            double weight = scanner.nextInt();

            // Conversion
            weight *= 0.45359237;

            // Output
            System.out.printf("The new weight in kgs is: %.2f", weight);

        }
        else if (option == 2){
            System.out.print("Enter the weight in kgs: ");
            double weight = scanner.nextInt();

            // Conversion
            weight *= 2.20462262185;

            // Output
            System.out.printf("The new weight in lbs is: %.2f", weight);

        }
        else{
            System.out.println("You didn't select an option!");
        }

        scanner.close();
    }
}
