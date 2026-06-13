import java.util.*;

class Logic {
    public void displayDigitsofNumber(int iNo) {
        int iDigit = 0;
        if(iNo < 0) {
            iNo = -iNo;
        }
        while (iNo > 0) {
            iDigit = iNo % 10;
            System.out.println(iDigit);
            iNo = iNo / 10;
        }
    }
}

public class printEachDigitsOfNumber {
    public static void main(String args [] ) {
       Logic obj = new Logic();
       obj.displayDigitsofNumber(55123);
        
    }
}
