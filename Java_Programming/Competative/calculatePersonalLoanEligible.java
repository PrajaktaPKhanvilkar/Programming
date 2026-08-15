import java.util.*;
public class calculatePersonalLoanEligible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age: ");
        int age = sc.nextInt();
        System.out.print("Enter your monthly income: ");
        double income = sc.nextDouble();
        System.out.print("Enter your credit score: ");
        int creditScore = sc.nextInt();
        System.out.print("Exixting Unpaid loan(Yes/No): ");
        String existingLoan = sc.next();

        if (age >= 21 && age <= 60 && income >= 25000 && creditScore >= 700 && existingLoan.equalsIgnoreCase("No")) {
            System.out.println("You are eligible for a personal loan.");
        } else {
            System.out.println("You are not eligible for a personal loan.");
        }
    }
    
}
