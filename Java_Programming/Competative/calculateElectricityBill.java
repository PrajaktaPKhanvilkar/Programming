import java.util.*;
public class calculateElectricityBill {
    public static void main(String args[]) {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of units consumed: ");
        int units = sobj.nextInt();

        double billAmount = 0;

        if (units < 0) {
            System.out.println("Invalid input. Units cannot be negative.");
        } else if (units <= 100) {
            billAmount = units * 5;
        } else if (units> 100 && units <= 200) {
            billAmount = (100 * 5) + ((units - 100) * 7);
        } else if (units > 200) {
            billAmount = (100 * 5) + (100 * 7) + ((units - 200) * 10);
        }

        System.out.println("Total Electricity Bill: " + billAmount);
    }
}
