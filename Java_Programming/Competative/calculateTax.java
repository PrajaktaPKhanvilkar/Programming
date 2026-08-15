import java.util.*;
public class calculateTax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your income: ");
        int income = sc.nextInt();
        double tax = 0;

        if (income <= 250000) {
            tax = 0;
        } else if (income <= 500000) {
            tax = (income - 250000) * 0.05;
        } else if (income <= 1000000) {
            tax = (income - 500000) * 0.2 + 12500; // 5% of 250000
        } else {
            tax = (income - 1000000) * 0.3 + 112500; // 20% of 500000 + 5% of 250000
        }

        System.out.println("Your calculated tax is: " + tax);
    }
}
