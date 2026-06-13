import java.util.*;

class Logic {
    public void checkPrime(int iNo) {
        int iCnt = 0;
        for (int i = 2; i <= (iNo / 2); i++) {
            if ((iNo % i) == 0) {
                iCnt++;
                break;
            }
        }
        if (iCnt == 0) {
            System.out.println("Number is prime");
        } else {
            System.out.println("Number is not prime");
        }
    }
}



public class checkPrimeNumber {
    public static void main(String args [] ) {
       Logic obj = new Logic();
       obj.checkPrime(11);
        
    }
}
