import java.util.*;

class Logic {
    void sumOfDigits(int n) {
        int sum = 0;
        while(n > 0) {
            int rem = n % 10;
            sum += rem;
            n /= 10;
        }
        System.out.println("Sum of digits is: " + sum);
    }

}

public class sumOfDigitsOfNumber {
    public static void main(String args [] ) {
       Logic obj = new Logic();
        obj.sumOfDigits(1234);
    }
}
