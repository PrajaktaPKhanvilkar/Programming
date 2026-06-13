import java.util.*;

class Logic {
    public void displayFactors(int iNo) {
        System.out.println("Factors of " + iNo + " are:");
        for (int i = 1; i <= iNo; i++) {
            if (iNo % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // Print a new line at the end
    }
}

public class displayFactors {
    public static void main(String args [] ) {
       Logic obj = new Logic();
       obj.displayFactors(10);
        
    }
}