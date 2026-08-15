import java.util.*;

public class calculateItemPurchased {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double totalCost = 0.0;
        int iCount = 0;

        System.out.print("Enter the Budget: ");
        double budget = sc.nextDouble();

        if (budget < 0) {
            System.out.println("Invalid budget. Please enter a positive value.");
            return;
        }

        System.out.print("Enter the Number of Items: ");
        int numberOfItems = sc.nextInt();

        if (numberOfItems < 0) {
            System.out.println("Invalid number of items. Please enter a positive value.");
        }

        int Arr[] = new int[numberOfItems];
        System.out.println("Enter " + numberOfItems + " item prices: ");

        for (int i = 0; i < numberOfItems; i++) {
            iCount++;
            Arr[i] = sc.nextInt();
            totalCost += Arr[i];
        }

        System.out.println("Items Purchased: " + iCount);
        System.out.println("Total cost of items: " + totalCost);
    }
}