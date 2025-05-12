import java.util.Scanner;

public class TempConverter
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a temperature: ");
		double temp = scanner.nextDouble();
		scanner.nextLine();
		
        System.out.print("Converting from Celsius or Fahrenheit? (C or F): ");
        String conversion = scanner.nextLine();
        
        if (conversion.equalsIgnoreCase("c")){
            temp = (temp * (9.0/5.0)) + 32;
            System.out.printf("%.1f°F", temp);
        }
        else if (conversion.equalsIgnoreCase("f")){
            temp = (temp - 32) * (5.0/9.0);
            System.out.printf("%.1f°C", temp);
        }
        else {
            System.out.print("Invalid response!");
        }
        
        scanner.close();
	}
}
