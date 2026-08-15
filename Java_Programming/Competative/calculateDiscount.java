import java.util.*;

public class calculateDiscount {
    public static void main(String args[]) {
        Scanner sobj = new Scanner(System.in);
        double discount = 0;
        System.out.println("Enter the purchase amount: ");
        int purchaseAmount = sobj.nextInt();

        System.out.println("Enter Membership Type: ");
        String membershipType = sobj.next();

        if (purchaseAmount < 0) {
            System.out.println("Invalid input. Purchase amount cannot be negative.");
        }
        if (!membershipType.equals("Regular") && !membershipType.equals("Premium") && !membershipType.equals("regular") && !membershipType.equals("premium")) {
            System.out.println("Invalid membership type.");
        } else {

            if (purchaseAmount > 5000) {
                if (membershipType.equals("Regular") || membershipType.equals("regular")) {
                    discount = purchaseAmount * 0.20;
                } else if (membershipType.equals("Premium") || membershipType.equals("premium")) {
                    discount = purchaseAmount * 0.25;
                }
            } else if (purchaseAmount > 2000) {
                if (membershipType.equals("Regular") || membershipType.equals("regular")) {
                    discount = purchaseAmount * 0.10;
                } else if (membershipType.equals("Premium") || membershipType.equals("premium")) {
                    discount = purchaseAmount * 0.15;
                }
            } else {
                System.out.println("No discount applicable for purchase amount less than or equal to 2000.");
            }

        }

        System.out.println("Total Purchase Amount: " + purchaseAmount);
        System.out.println("Membership Type: " + membershipType);
        System.out.println("Discount Amount: " + discount);
        System.out.println("Final Amount to be Paid: " + (purchaseAmount - discount));

    }
}
