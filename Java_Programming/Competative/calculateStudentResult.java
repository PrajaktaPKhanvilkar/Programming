import java.util.*;

public class calculateStudentResult {
    public static void main(String args[]) {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Marks of first subject: ");
        int sub1 = sobj.nextInt();
        System.out.println("Enter Marks of second subject: ");
        int sub2 = sobj.nextInt();
        System.out.println("Enter Marks of third subject: ");
        int sub3 = sobj.nextInt();
        System.out.println("Enter Marks of fourth subject: ");
        int sub4 = sobj.nextInt();
        System.out.println("Enter Marks of fifth subject: ");
        int sub5 = sobj.nextInt();

        if (sub1 < 0 || sub2 < 0 || sub3 < 0 || sub4 < 0 || sub5 < 0) {
            System.out.println("Invalid input. Marks cannot be negative.");
        } else if (sub1 > 100 || sub2 > 100 || sub3 > 100 || sub4 > 100 || sub5 > 100) {
            System.out.println("Invalid input. Marks cannot be greater than 100.");
        } else {
            int totalMarks = sub1 + sub2 + sub3 + sub4 + sub5;
            double percentage = (totalMarks / 500.0) * 100;

            System.out.println("Total Marks: " + totalMarks);
            System.out.println("Percentage: " + percentage + "%");
            if (percentage >= 75) {
                System.out.println("Distinction");
            } else if (percentage >= 60) {
                System.out.println("First Class");
            } else if (percentage >= 50) {
                System.out.println("Second Class");
            } else if (percentage < 50 && percentage >= 35) {
                System.out.println("Pass");
            } else if (percentage < 35) {
                System.out.println("Fail");
            }
        }
    }
}
