import java.util.*;

class Logic {
    public void sumOfEvenOddDigits(int iNo) {
        int iDigit = 0;
        int iEvenSum = 0;
        int iOddSum = 0;
       while (iNo>0) {
            iDigit = iNo % 10;
            if (iDigit % 2 == 0) {
                iEvenSum = iEvenSum + iDigit;
            } else {
                iOddSum = iOddSum + iDigit;
            }
            iNo = iNo / 10;
        }
        System.out.println("Sum of Even Digits is: " + iEvenSum);
        System.out.println("Sum of Odd Digits is: " + iOddSum);
        
       }
    }




public class sumOfEvenOddDigits {
    public static void main(String args [] ) {
       Logic obj = new Logic();
       obj.sumOfEvenOddDigits(123456);
        
    }
}
