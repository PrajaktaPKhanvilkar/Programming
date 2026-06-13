import java.util.*;

class Logic {
    public void MultiplicationTable(int iNo) {
        for(int i=1; i<=10; i++) {
            System.out.println(iNo+" * "+i+" = "+(iNo*i));
        }
    }
}



public class MultiplicationTableOfNumber {
    public static void main(String args [] ) {
       Logic obj = new Logic();
       obj.MultiplicationTable(2);
        
    }
}