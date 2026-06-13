import java.util.*;

class Logic {
    public void displayGrade(int iNo) {
        if(iNo >= 90){
            System.out.println("Grade is A");
        }else if(iNo >= 80){
            System.out.println("Grade is B");
        }else{
            System.out.println("Grade is C");
        }
    }
}

public class studentsGrade {
    public static void main(String args [] ) {
       Logic obj = new Logic();
       obj.displayGrade(85);
        
    }
}
