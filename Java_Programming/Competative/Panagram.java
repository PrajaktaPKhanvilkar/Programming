
import java.util.*;

class StringX {
    public boolean checkPanagram(String str1) {
        boolean bFlag = false;
        int i = 0;
        str1 = str1.trim();
        str1 = str1.replaceAll("\\s+", " ");
        str1 = str1.toLowerCase();
        char Arr[] = str1.toCharArray();
        int frequency[] = new int[26];

        for (i = 0; i < Arr.length; i++) {
            if (Arr[i] >= 'a' && Arr[i] <= 'z') {
                frequency[(int) Arr[i] - 97]++;
            }
        }
        for (i = 0; i < frequency.length; i++) {
            if(frequency[i] >= 1){
                bFlag = true;
            }
        }

        return bFlag;

    }
}

public class Panagram {
    public static void main(String A[]) {
        Scanner sobj = new Scanner(System.in);

        boolean bRet = false;
        StringX strobj = new StringX();

        System.out.println("Enter first String");
        String str1 = sobj.nextLine();


        bRet = strobj.checkPanagram(str1);
        if (bRet == true) {
            System.out.println("String is Panagram");
        } else {
            System.out.println("String is not Panagram");
        }

    }
}
