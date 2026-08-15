import java.util.*;
public class calculateToatlFairOfRide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the distance of the ride in kilometers: ");
        double distance = sc.nextDouble();
        System.out.print("Enter the Peak Hour (Yes/No): ");
        String peakHour = sc.next();

        double totalFare = 0;
        int BaseFare = 50; // Base fare for the ride

        if (distance <= 0) {
            System.out.println("Distance should be greater than zero.");
            return;
        }
        if (distance <= 10) {
            totalFare = BaseFare + (distance * 12);
        } else {
            totalFare = BaseFare + (10 * 12) + ((distance - 10) * 15);
        }
        if (peakHour.equals("Yes")) {
            totalFare += totalFare * 0.2; // Adding 20% surcharge for peak hour
        }
        System.out.println("The total fare of the ride is: " + totalFare);
    }
}
