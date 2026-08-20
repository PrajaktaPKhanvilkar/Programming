// string is anagram or not 
// if string 1 and string 2 are having same letters and same frequency of letter

import java.util.*;

class StringX {
    public boolean CheckAnagram(String str1, String str2) {
        if(str1.length() != str2.length()){
            return false;
        }
        char Arr[] = str1.toCharArray();
        char Brr[] = str2.toCharArray();

        Arrays.sort(Arr);
        Arrays.sort(Brr);

        str1 = new String(Arr);
        str2 = new String(Brr);

        return str1.equals(str2);
        
    }
}

public class Anagram {
    public static void main(String A[]) {
        Scanner sobj = new Scanner(System.in);

        boolean bRet = false;
        StringX strobj = new StringX();

        System.out.println("Enter first String");
        String str1 = sobj.nextLine();

        System.out.println("Enter second String");
        String str2 = sobj.nextLine();

        bRet = strobj.CheckAnagram(str1, str2);
        if (bRet == true) {
            System.out.println("Strings are anagram");
        } else {
            System.out.println("Strings are not anagram");
        }

    }
}
