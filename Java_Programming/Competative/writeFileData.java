import java.util.*;
import java.io.*;

public class writeFileData {
    public static void main(String A[]) {
        File fobj = null;
        boolean bRet = false;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter file name to create");
        String fname = sobj.nextLine();
        System.out.println("Enter Data you want to write");
        String data = sobj.nextLine();
        try {
            fobj = new File(fname);
            bRet = fobj.exists();
            if (bRet == true) {
                FileOutputStream fout = new FileOutputStream(fname);
                byte b[] = data.getBytes();// converting string into byte array
                fout.write(b);
                fout.close();
                System.out.println("Data written successfully");
            }
        } catch (IOException iobj) {
            System.out.println(iobj);
        } catch (Exception eobj) {
            System.out.println(eobj);
        }

    }

}
