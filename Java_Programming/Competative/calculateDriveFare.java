import java.util.*;
public class calculateDriveFare {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the distance traveled (in km): ");
        double distance = sobj.nextDouble();
        System.out.println("Enter class type(Sleeper/3AC/2AC): ");
        String classType = sobj.next();
        System.out.println("Enter Booking Hours Before: ");
        int bookingHoursBefore = sobj.nextInt();
        System.out.println("Enter the Age: ");
        int age = sobj.nextInt();

        double finalFare =0;
        String reasonBreakdown = "";

        if(bookingHoursBefore < 24) {
            finalFare = finalFare + (finalFare * 0.3);
            reasonBreakdown += "Booking made less than 24 hours before departure. ";
        }
        if(age >= 60) {
            finalFare = finalFare - (finalFare * 0.4);
            reasonBreakdown += "Senior citizen discount applied. ";
        }
        if(classType.equalsIgnoreCase("Sleeper")) {
            finalFare = distance * 1.0;
        } else if(classType.equalsIgnoreCase("3AC")) {
            finalFare = distance * 2.0;
        } else if(classType.equalsIgnoreCase("2AC")) {
            finalFare = distance * 3.0;
        } else {
            System.out.println("Invalid class type entered.");
            return; 
        }
        System.out.println("Final Fare: " + finalFare);
        System.out.println("Reason Breakdown: " + reasonBreakdown);
    }
}