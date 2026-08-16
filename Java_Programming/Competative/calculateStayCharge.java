import java.util.*;

public class calculateStayCharge {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Number of Days Stayed");
        int daysStayed = sobj.nextInt();
        double finalBill = 0;
        int billPerDay = 3000;

        if (daysStayed <= 0) {
            System.out.println("Days must not be less than or Equals to 0");
        } else {
            finalBill = daysStayed * billPerDay;

            if (daysStayed > 7) {
                double discount = finalBill * 0.05;
                finalBill -= discount;
            }
        }

        System.out.println("Total Stay Duration : "+ daysStayed);
        System.out.println("Final Bill Amount : "+ finalBill);
    }
}
