import java.util.*;

class Logic {
    public Boolean checkPalindrome(int iNo) {
        int iDigit = 0, iReverse =0;
        int iTemp = iNo;
        while(iNo > 0) {
            iDigit  = iNo % 10;
            iReverse = (iReverse * 10) + iDigit; 
            iNo /= 10;
        }
        if(iTemp == iReverse){
            return true;
        }else{
            return false;
        }
        
    }

}

public class checkPalindrome {
    public static void main(String args [] ) {
        Boolean iRet = false;
       Logic obj = new Logic();
        iRet = obj.checkPalindrome(121);
        if(iRet == true){
            System.out.println("121 is Palindrome");
        }else{
             System.out.println("121 is not a Palindrome");
        }
    }
}
