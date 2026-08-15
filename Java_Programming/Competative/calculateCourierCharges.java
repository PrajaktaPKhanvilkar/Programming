import java.util.*;
public class calculateCourierCharges {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the weight of the package in kilograms: ");
        double weight = sc.nextDouble();

        double totalCharge = 0;

        if (weight <= 0) {
            System.out.println("Weight should be a positive value.");
            return;
        }
        if(weight <= 1){
            totalCharge = 50;
        }else
        if (weight>=1 && weight <= 5) {
            totalCharge = (1 * 50) + ((weight - 1) * 20);
        } else {
            totalCharge = (1 * 150) + ((weight - 5) * 30);
        }
        
        System.out.println("The total charge for the courier is: " + totalCharge);
    }
}
