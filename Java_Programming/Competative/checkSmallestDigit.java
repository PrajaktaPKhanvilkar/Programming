import java.util.*;

class Logic {
    public void checkSmallestDigit(int iNo) {
        int smallest = 9;
        while(iNo > 0) {
            int digit = iNo % 10;
            if(digit < smallest) {
                smallest = digit;
            }
            iNo = iNo / 10;
        }
        System.out.println("Smallest digit is: " + smallest);
    }
}


public class checkSmallestDigit {
    public static void main(String args [] ) {
       Logic obj = new Logic();
       obj.checkSmallestDigit(528);
        
    }
}
