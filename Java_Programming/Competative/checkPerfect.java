import java.util.*;

class Logic {
    public void checkPerfect(int iNo) {
        int sum = 0;
        for(int i = 1; i <= iNo/2; i++) {
            if(iNo % i == 0) {
                sum = sum + i;
            }
        }
        if(sum == iNo) {
            System.out.println("Number is Perfect");
        } else {
            System.out.println("Number is not Perfect");
        }
    }
}

public class checkPerfect {
    public static void main(String args [] ) {
       Logic obj = new Logic();
       obj.checkPerfect(528);
        
    }
}
