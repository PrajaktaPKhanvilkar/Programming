import java.util.*;

class Logic {
    public void checkLeapYear(int iNo) {
        if(iNo % 4 == 0){
            System.out.println("Number is a Leap Year");
        }else{
            System.out.println("Number is not a Leap Year"); 
       }
    }
}

public class checkLeapYear {
    public static void main(String args [] ) {
       Logic obj = new Logic();
       obj.checkLeapYear(2021);
        
    }
}
