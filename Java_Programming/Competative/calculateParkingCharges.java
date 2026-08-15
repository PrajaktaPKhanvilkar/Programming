import java.util.*;
public class calculateParkingCharges {
    public static void main(String args[]) {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of hours parked: ");
        int hours = sobj.nextInt();

        double charges = 0;

        if (hours < 0) {
            System.out.println("Invalid input. Hours cannot be negative.");
        } else if (hours <= 2) {
            charges = 20;
        } else if (hours > 2 && hours <= 10) {
            charges = 20 + ((hours - 2) * 10);
        } else if (hours > 10) {
            charges = 20 + (3 * 10) + ((hours - 10) * 50);
        }

        System.out.println("Number of hours parked: " + hours);
        System.out.println("Total Parking Charges: " + charges);
    }
    
}
