import java.util.*;
import java.io.*;

public class readFileData {
    public static void main(String A[]) {
        File fobj = null;
        boolean bRet = false;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter file name to create");
        String fname = sobj.nextLine();
        try {
            fobj = new File(fname);
            bRet = fobj.exists();
            if (bRet == true) {
                FileInputStream fin = new FileInputStream(fname);
                BufferedInputStream bin = new BufferedInputStream(fin);
                int i;
                while ((i = bin.read()) != -1) {
                    System.out.println((char) i);
                }
                bin.close();
                fin.close();
            }
        } catch (IOException iobj) {
            System.out.println(iobj);
        } catch (Exception eobj) {
            System.out.println(eobj);
        }

    }

}
