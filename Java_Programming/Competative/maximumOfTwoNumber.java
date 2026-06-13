import java.util.*;

class Logic {
    public void maxOfTwo(int iNo, int iNo2) {
        if(iNo>iNo2){
            System.out.println("Max Number is : "+ iNo);
        }else{
            System.out.println("Max Number is : "+ iNo2);
        }
    }

}

public class MaximumOfTwoNumber {
    public static void main(String args [] ) {
       Logic obj = new Logic();
       obj.maxOfTwo(20,15);
        
    }
}
