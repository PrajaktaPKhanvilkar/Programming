import java.util.Scanner;

public class calculateWaterBill {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the water usage units: ");
        double waterUsage = sobj.nextDouble();
        System.out.println("Enter the weeks late: ");
        double weeksLate = sobj.nextDouble();
        double billAmount = 0;

        if(weeksLate > 0) {
            billAmount = waterUsage * 2.0;
            double penalty = Math.min(weeksLate * 0.02, 0.1);
            billAmount += billAmount * penalty;
        } else {
            if(waterUsage <= 10) {
                billAmount = waterUsage * 2.0;
            } else if(waterUsage <= 20) {
                billAmount = 20 + (waterUsage - 10) * 3.0;
            } else {
                billAmount = 50 + (waterUsage - 20) * 5.0;
            }
        }

        System.out.println("Total Cost: $" + billAmount);
    }
}
