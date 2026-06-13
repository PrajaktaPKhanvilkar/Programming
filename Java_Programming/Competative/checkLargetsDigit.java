import java.util.*;

class Logic {
    public void checkLargestDigit(int iNo) {
        int largest = 0;
        while(iNo > 0) {
            int digit = iNo % 10;
            if(digit > largest) {
                largest = digit;
            }
            iNo = iNo / 10;
        }
        System.out.println("Largest digit is: " + largest);
    }
}


public class checkLargetsDigit {
    public static void main(String args [] ) {
       Logic obj = new Logic();
       obj.checkLargestDigit(528);
        
    }
}
