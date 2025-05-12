import java.util.Scanner;
import java.lang.Math;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double firstNumber;
        double secondNumber;
        String operator;

        System.out.print("Enter the first number: ");
        firstNumber = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter an operator (+, -, *, /, ^): ");
        operator = scanner.nextLine();

        System.out.print("Enter the second number: ");
        secondNumber = scanner.nextDouble();

        switch(operator) {
            case "+" -> System.out.println(firstNumber + secondNumber);
            case "-" -> System.out.println(firstNumber - secondNumber);
            case "*" -> System.out.println(firstNumber*secondNumber);
            case "/" -> {
                if (secondNumber == 0) {
                    System.out.println("You can't divide by zero!");
                }
                else{
                    System.out.println(firstNumber/secondNumber);
                }
            }
            case "^" -> System.out.println(Math.pow(firstNumber, secondNumber));
            default -> System.out.println("You didn't enter a valid operator!");
        }

        scanner.close();
    }
}
