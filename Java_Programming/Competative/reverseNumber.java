import java.util.*;

class Logic {
    public void reverseNumbers(int iNo) {
        int iCnt = 0;
        for (iCnt = iNo; iCnt > 0; iCnt--) {

            System.out.println(iCnt);
        }
    }
}

public class reverseNumber {
    public static void main(String args[]) {
        Logic obj = new Logic();
        obj.reverseNumbers(20);

    }
}
