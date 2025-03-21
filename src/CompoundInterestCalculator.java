import java.util.Scanner;

public class CompoundInterestCalculator{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double principal;
        double rate;
        int compoundedAmount;
        int years;
        double total;

        System.out.print("Enter the principal amount: ");
        principal = scanner.nextDouble();

        System.out.print("Enter the interest rate: ");
        rate = (scanner.nextDouble() / 100);

        System.out.print("Enter the number of times compounded per year: ");
        compoundedAmount = scanner.nextInt();

        System.out.print("Enter the number of years: ");
        years = scanner.nextInt();

        total = principal * Math.pow((1 + rate / compoundedAmount), (years * compoundedAmount));
        System.out.printf("The amount after %d year(s) is $%.2f", years, total);

        scanner.close();

    }
}
