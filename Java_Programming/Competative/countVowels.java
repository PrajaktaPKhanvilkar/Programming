
import java.util.*;

class StringX {
    public void countVowels(String str1) {
        int i = 0, iVowels = 0, iConsonents = 0;
        str1 = str1.trim();
        str1 = str1.replaceAll("\\s+", " ");
        str1 = str1.toLowerCase();
        char Arr[] = str1.toCharArray();
       

        for (i = 0; i < Arr.length; i++) {
            if (Arr[i] == 'a' || Arr[i] == 'e'|| Arr[i] == 'i' || Arr[i] == 'o' || Arr[i] == 'u') {
                iVowels++;
            }else{
                iConsonents++;
            }
        }
        
        System.out.println("Vowels are: "+ iVowels);
        System.out.println("Consonents are: "+ iConsonents);

    }
}

public class countVowels {
    public static void main(String A[]) {
        Scanner sobj = new Scanner(System.in);

        StringX strobj = new StringX();

        System.out.println("Enter first String");
        String str1 = sobj.nextLine();


        strobj.countVowels(str1);

    }
}
