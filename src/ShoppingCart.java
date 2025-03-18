import java.util.Scanner;

public class ShoppingCart{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String itemName;
        double itemPrice;
        int itemQuantity;
        
        System.out.print("What is the item you are buying?: ");
        itemName = scanner.nextLine();
        
        System.out.print("What is the price of each item?: ");
        itemPrice = scanner.nextDouble();
        
        System.out.print("How much of the item are you buying?: ");
        itemQuantity = scanner.nextInt();
        
        double totalItemPrice = itemPrice*itemQuantity;
        
        
        if (itemQuantity == 1){
            System.out.println("\nYou have bought 1 " + itemName);
        }
        else{
            System.out.println("\nYou have bought " + itemQuantity + " " + itemName + "s");
        }
        
        System.out.printf("Your total is $%.2f", totalItemPrice);
        
        
        scanner.close();
    }
}
