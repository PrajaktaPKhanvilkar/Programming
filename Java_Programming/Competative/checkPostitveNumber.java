import java.util.*;

class Logic {
    public void checkPositiveNumber(int iNo) {
        if(iNo > 0){
            System.out.println("Number is Positive");
        }else if(iNo < 0){
            System.out.println("Number is Negative");
        }else{
            System.out.println("Number is Zero");   
       }
    }
}




public class checkPostitveNumber {
    public static void main(String args [] ) {
       Logic obj = new Logic();
       obj.checkPositiveNumber(-8);
        
    }
}
