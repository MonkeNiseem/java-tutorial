import java.util.Scanner;

public class MadLibsGame {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        String adjective1;
        String name1;
        String noun1;
        String adjective2;
        String verb1;
        String verb2;
        String noun2;
        
        System.out.print("Enter an adjective: ");
        adjective1 = scanner.nextLine();
        System.out.print("Enter a name: ");
        name1 = scanner.nextLine();
        System.out.print("Enter a noun: ");
        noun1 = scanner.nextLine();
        System.out.print("Enter another adjective: ");
        adjective2 = scanner.nextLine();
        System.out.print("Enter a verb: ");
        verb1 = scanner.nextLine();
        System.out.print("Enter another verb: ");
        verb2 = scanner.nextLine();
        System.out.print("Enter another noun: ");
        noun2 = scanner.nextLine();
        
        
        System.out.println("I'm working at the " + adjective1 + " library with " + name1 + ".");
        System.out.println("We are sitting on " + noun1 + "s while working.");
        System.out.println("The work we are doing is " + adjective2 + ".");
        System.out.println("After we finish our work, we will " + verb1 + " and " + verb2 + " on " + noun2 + ".");
        
        scanner.close();
    }
}
