import java.util.*;

class Logic {
    public void calculatePower(int base,int expo) {
        int result = 1;
        for(int i = 0; i < expo; i++) {
            result = result * base;
        }
        System.out.println(result);
    }
}

public class calculatePower {
    public static void main(String args [] ) {
       Logic obj = new Logic();
       obj.calculatePower(5, 3);
        
    }
}
