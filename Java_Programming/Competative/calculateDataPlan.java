import java.util.*;
public class calculateDataPlan{
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the data usage (in GB): ");
        double dataUsage = sobj.nextDouble();
        System.out.println("Enter call duration (in minutes): ");
        int callDuration = sobj.nextInt();
        System.out.println("Enter Sms count: ");
        int smsCount = sobj.nextInt();
        int recommendedPlan = 0;
        int totalCost = 0;

        if(dataUsage <= 2 && callDuration <= 100 && smsCount <= 50) {
            recommendedPlan = 1;
            totalCost = 10;
        } else if(dataUsage <= 5 && callDuration <= 300 && smsCount <= 200) {
            recommendedPlan = 2;
            totalCost = 20;
        } else if(dataUsage <= 10 && callDuration <= 500 && smsCount <= 500) {
            recommendedPlan = 3;
            totalCost = 30;
        } else {
            recommendedPlan = 4;
            totalCost = 50;
        }
        System.out.println("Recommended Plan: " + recommendedPlan);
        System.out.println("Total Cost: $" + totalCost);
       }

}