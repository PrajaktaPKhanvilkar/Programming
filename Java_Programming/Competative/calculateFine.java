import java.util.*;
public class calculateFine {
    public static void main(String args[]){
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number of days late: ");
        int daysLate = sobj.nextInt();

        int fine = 0;
        if(daysLate < 0){
            System.out.println("Invalid input. Days late cannot be negative.");
            return;
        }
        else if(daysLate >= 0 && daysLate <= 7){
            System.out.println("Returned on time. No fine.");
            return;
        }
        else if(daysLate > 7 && daysLate <= 12){
            fine = (daysLate - 7) * 5;
        }
        else if(daysLate > 12){
            fine = (daysLate - 12) * 10;
        }
        if(daysLate <= 7){
           System.out.println("Returned on time. No fine.");
        }
        else if(daysLate > 7 && daysLate <= 12){
            fine = (daysLate - 7) * 5;
        }
        else if(daysLate > 12){
            fine = (daysLate - 12) * 10;
        }

        System.out.println("The fine is: " + fine);
    }
}
