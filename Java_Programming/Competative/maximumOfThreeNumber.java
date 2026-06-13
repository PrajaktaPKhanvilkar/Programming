import java.util.*;

class Logic {
    public void maxOfThree(int iNo, int iNo2, int iNo3) {
        if(iNo>iNo2 && iNo>iNo3){
            System.out.println("Max Number is : "+ iNo);
        }else if(iNo2>iNo3){
            System.out.println("Max Number is : "+ iNo2);
        }else{
            System.out.println("Max Number is : "+ iNo3);
        }
    }

}

public class maximumOfThreeNumber {
    public static void main(String args [] ) {
       Logic obj = new Logic();
       obj.maxOfThree(20,15,10);
        
    }
}