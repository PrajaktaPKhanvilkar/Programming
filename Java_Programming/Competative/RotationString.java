
import java.util.*;

class StringX {
    public boolean CheckRotation(String str1, String str2) {
        if(str1.length() != str2.length()){
            return false;
        }
        
         String concatenated = str1 + str1;

        return concatenated.contains(str2);
        
    }
}

public class RotationString {
    public static void main(String A[]) {
        Scanner sobj = new Scanner(System.in);

        boolean bRet = false;
        StringX strobj = new StringX();

        System.out.println("Enter first String");
        String str1 = sobj.nextLine();

        System.out.println("Enter second String");
        String str2 = sobj.nextLine();

        bRet = strobj.CheckRotation(str1, str2);
        if (bRet == true) {
            System.out.println("Strings are in Rotation");
        } else {
            System.out.println("Strings are not in Rotation");
        }

    }
}
