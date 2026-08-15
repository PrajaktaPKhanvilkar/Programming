import java.util.*;
public class checkBatteryPercent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the battery percentage: ");
        int batteryPercent = sc.nextInt();

        if (batteryPercent < 0 || batteryPercent > 100) {
            System.out.println("Invalid battery percentage. Please enter a value between 0 and 100.");
            return;
        }

        if (batteryPercent > 15) {
            System.out.println("Battery is in good condition.");
        } else if (batteryPercent <= 15 && batteryPercent > 5) {
            System.out.println("Battery is low. Please charge soon.");
        } else if (batteryPercent <= 5 && batteryPercent > 0) {
            System.out.println("Battery is critically low. Charge immediately.");
        }
    }
    
}
