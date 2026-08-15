import java.util.*;
public class checkScholarship {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();

        System.out.print("Enter Attendance percentage: ");
        int attendance = sc.nextInt();

        System.out.println("Enter Family Income:");
        int familyIncome = sc.nextInt();
        if (marks >= 80 && attendance >= 75 && familyIncome <= 300000) {
            System.out.println("You are eligible for scholarship.");
        } else {
            System.out.println("You are not eligible for scholarship.");
        }
    }
}