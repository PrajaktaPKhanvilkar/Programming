import java.util.*;

public class checkStockAvailable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Current Stock: ");
        int stock = sc.nextInt();
        System.out.print("Enter requested Quantity: ");
        int requested = sc.nextInt();

        int remainingStock = 0;
        if (requested <= 0) {
            System.out.println("Requested quantity should be greater than zero.");
        } else if (stock <= 0) {
            System.out.println("Stock is not available.");
        } else if (requested <= stock) {
            remainingStock = stock - requested;
            if (remainingStock < 5) {
                System.out.println("Stock is low. Please restock soon.");
            }
            System.out.println("Remaining Stock: " + remainingStock);

        } else {
            System.out.println("Stock is not available.");
        }

    }
}
