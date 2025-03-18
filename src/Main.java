import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your email: ");
        String email = scanner.nextLine();

        if(email.contains("@")){
            String username = email.substring(0, email.indexOf("@"));
            String domain = email.substring(email.indexOf("@")+1);

            System.out.println(username);
            System.out.println(domain);
        }
        else{
            System.out.println("Invalid email!");
        }

        scanner.close();

    }
}