import java.util.*;
public class checkTrafficVoilation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalFine = 0;
        System.out.println("Enter If Helmet is worn (Yes/No): ");
        String helmet = sc.next();
        System.out.print("Enter Licence available (Yes/No): ");
        String licence = sc.next();
        System.out.print("Enter Overspeeding (Yes/No): ");
        String overspeeding = sc.next();

        if(helmet.equals("Yes")) {
            totalFine += 500;
            System.out.println("Fine for not wearing helmet: $500");
        }
        if(licence.equals("Yes")) {
            totalFine += 1000;
            System.out.println("Fine for driving without license: $1000");
        }
        if(overspeeding.equals("Yes")) {
            totalFine += 1500;
            System.out.println("Fine for overspeeding: $1500");
        }


        System.out.println("Total Fine: $" + totalFine);
    }
}
