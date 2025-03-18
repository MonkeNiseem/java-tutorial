import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Length: ");
        double width = scanner.nextDouble();

        System.out.print("Width: ");
        double height = scanner.nextDouble();

        scanner.close();

        double area = width*height;

        System.out.println(area);
    }
}