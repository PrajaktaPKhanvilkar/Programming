import java.util.*;

class Logic {
    public void nEvenNumbers(int iNo) {
        int iCnt = 0;
        for (iCnt = 1; iCnt<= iNo;iCnt++){
            if ((iCnt % 2) == 0) {
                System.out.println(iCnt);
            }
        }
    }
}



public class nEvenNumber {
    public static void main(String args [] ) {
       Logic obj = new Logic();
       obj.nEvenNumbers(20);
        
    }
}
