import java.util.*;

class Logic {
    public void sumOfEvenNumbers(int iNo) {
        int iEvenSum = 0;
        int iCnt = 0;
        for (iCnt = 1; iCnt <= iNo; iCnt++) {
            if ((iCnt % 2) == 0) {
                iEvenSum = iEvenSum + iCnt;
            }
        }
        System.out.println("Sum of Even Digits is: " + iEvenSum);

    }
}

public class sumOfEvenNumbers {
    public static void main(String args[]) {
        Logic obj = new Logic();
        obj.sumOfEvenNumbers(20);

    }
}
