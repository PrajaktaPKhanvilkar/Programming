import java.util.*;

class Logic {
    public void printDivisibility(int iNo) {
        if((iNo %5 == 0)&&(iNo %11 ==0)){
            System.out.println("Number is Divisible by 5 and 11");
        }else{
            System.out.println("Number is not Divisible by 5 and 11");
        }
    }
}

public class numberDivisibleByfiveandeleven {
    public static void main(String args [] ) {
       Logic obj = new Logic();
       obj.printDivisibility(55);
        
    }
}
