import java.util.*;

class Logic {
    public void countFactors(int iNo) {
        int count = 0;
        System.out.println("Factors of " + iNo + " are:");
        for (int i = 1; i <= iNo; i++) {
            if (iNo % i == 0) {
                count++;
            }
        }
        System.out.println("\nTotal factors: " + count);
    }
}

public class countFactors {
    public static void main(String args [] ) {
       Logic obj = new Logic();
       obj.countFactors(10);
        
    }
}