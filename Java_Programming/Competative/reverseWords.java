//Input : my name is amit
//output: ym eman si tima
import java.util.*;

class StringX {
    public String wordReverse(String str) {
        str = str.trim();
        str = str.replaceAll("\\s+", " ");
        String tokens[] = str.split(" ");
        StringBuffer sb = null;
        StringBuffer FinalStr = new StringBuffer("");
        for (int i = 0; i < tokens.length; i++) {
            sb = new StringBuffer(tokens[i]);
            sb = sb.reverse();
            FinalStr = FinalStr.append(sb);
            FinalStr = FinalStr.append(" ");
        }
        String output = new String(FinalStr);
        output = output.trim();
        return output;
    }
}

public class reverseWords {
    public static void main(String A[]) {
        Scanner sobj = new Scanner(System.in);

        StringX strobj = new StringX();
        
        String sRet = null;

        System.out.println("Enter String");
        String str = sobj.nextLine();

        sRet = strobj.wordReverse(str);
        System.out.println(sRet);

    }
}
