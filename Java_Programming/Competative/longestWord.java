
import java.util.*;

class StringX {
    int countWords(String str) {
        str = str.trim();
        str = str.replaceAll("\\s+", " ");
        String Tokens[] = str.split(" ");

        return Tokens.length;
    }

    void DisplayWords(String str) {
        str = str.trim();
        str = str.replaceAll("\\s+", " ");
        String Tokens[] = str.split(" ");

        for (int i = 0; i < Tokens.length; i++) {
            System.out.println(Tokens[i] + " : " + Tokens[i].length());
        }
    }

    void largestWord(String str) {
        int iMax = 0;
        String temp = null;
        str = str.trim();
        str = str.replaceAll("\\s+", " ");
        String Tokens[] = str.split(" ");
        for (int i = 0; i < Tokens.length; i++) {
            if (iMax < Tokens[i].length()) {
                iMax = Tokens[i].length();
                temp = Tokens[i];
            }
        }
        System.out.println("Longest Word length is : " + iMax);
        System.out.println("Longest Word is : " + temp);
    }

    int PatternMatching(String str, String word) {
        int icount = 0;
        str = str.trim();
        str = str.replaceAll("\\s+", " ");
        String Tokens[] = str.split(" ");
        for (int i = 0; i < Tokens.length; i++) {
            if(word.equals(Tokens[i])){
                icount ++;
            }
        }
        return icount;
    }
}

public class longestWord
 {
    public static void main(String A[]) {
        Scanner sobj = new Scanner(System.in);
        String str = null;
        int iRet = 0;

        StringX strobj = new StringX();

        System.out.println("Enter the String");
        str = sobj.nextLine();

        iRet = strobj.countWords(str);
        System.out.println("Number of words are:" + iRet);
        // strobj.DisplayWords(str);
        // strobj.largestWord(str);
        iRet = strobj.PatternMatching(str,"are");
        System.out.println("Frequency of the word is :" + iRet);
    }
}
