import java.util.*;

class Logic {
    public void nOddNumbers(int iNo) {
        int iCnt = 0;
        for (iCnt = 1; iCnt<= iNo;iCnt++){
            if ((iCnt % 2) != 0) {
                System.out.println(iCnt);
            }
        }
    }
}



public class nOddNumber {
    public static void main(String args [] ) {
       Logic obj = new Logic();
       obj.nOddNumbers(20);
        
    }
}
