import java.util.*;
public class calculateHospitalBill {
    public static void main(String[] args) {

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number of days spent in the hospital: ");
        int days = sobj.nextInt();
        System.out.println("Enter ward type (Normal/ICU):");
        String wardType = sobj.next();
        System.out.println("Enter Medicine Bill: ");
        int medicineBill = sobj.nextInt();
        System.out.println("Enter Consultantation Fees: ");
        int consultationFees = sobj.nextInt();
        System.out.println("Enter Insured (Yes/No): ");
        String insured = sobj.next();

        double totalBill = 0;
        double insuranceCoverage = 0;
        double finalPayable = 0;

        if(wardType.equalsIgnoreCase("Normal")) {
            totalBill = (days * 5000) + medicineBill + consultationFees;
        } else if(wardType.equalsIgnoreCase("ICU")) {
            totalBill = (days * 10000) + medicineBill + consultationFees;
        } else {
            System.out.println("Invalid ward type entered.");
            return;
        }

        if(insured.equalsIgnoreCase("Yes")) {
            insuranceCoverage = totalBill * 0.7; // Assuming insurance covers 70% of the total bill
            finalPayable = totalBill - insuranceCoverage;
        } else {
            finalPayable = totalBill;
        }

        System.out.println("Total Bill: " + totalBill);
        System.out.println("Insurance Coverage: " + insuranceCoverage);
        System.out.println("Final Payable Amount: " + finalPayable);
    }
      
}
