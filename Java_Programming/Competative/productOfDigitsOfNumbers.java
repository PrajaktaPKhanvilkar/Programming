import java.util.*;

class Logic {
    public void productOfDigits(int iNo) {
        int product = 1;
        while(iNo > 0) {
            int digit = iNo % 10;
            product = product * digit;
            iNo = iNo / 10;
        }
        System.out.println("Product of digits is: " + product);
    }
}



public class productOfDigitsOfNumbers {
    public static void main(String args [] ) {
       Logic obj = new Logic();
       obj.productOfDigits(528);
        
    }
}
