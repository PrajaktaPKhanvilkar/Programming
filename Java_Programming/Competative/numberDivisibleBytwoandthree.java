import java.util.*;

class Logic {
    public void printDivisibility(int iNo) {
        int iCnt = 0;
        for (iCnt = 1; iCnt <= iNo; iCnt++) {
            if ((iCnt % 2 == 0) && (iCnt % 3 == 0)) {
                System.out.println(iCnt);
            }
        }

    }
}

public class numberDivisibleBytwoandthree {
    public static void main(String args[]) {
        Logic obj = new Logic();
        obj.printDivisibility(55);

    }
}
