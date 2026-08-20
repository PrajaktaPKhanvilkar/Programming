import java.util.*;

class StringX {
    public boolean checkPalindrom(String str1) {
        String reversed = new StringBuilder(str1).reverse().toString();
        return str1.equals(reversed);
        
    }
}

public class Palindrom {
    public static void main(String A[]) {
        Scanner sobj = new Scanner(System.in);

        boolean bRet = false;
        StringX strobj = new StringX();

        System.out.println("Enter first String");
        String str1 = sobj.nextLine();
        bRet = strobj.checkPalindrom(str1);
        if (bRet == true) {
            System.out.println("String is Palindrom");
        } else {
            System.out.println("String is not Palindrom");
        }

    }
}
