import java.util.*;
import java.io.*;

public class displayFileDetails {
    public static void main(String A[]) {
        File fobj = null;
        boolean bRet = false;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter file name");
        String fname = sobj.nextLine();
        try {
            fobj = new File(fname);
            bRet = fobj.exists();
            if (bRet == true) {
                        System.out.println("File Name: " + fobj.getName()+"\n");
                        System.out.println("Absolute Path : "+fobj.getPath()+"\n");
                        System.out.println("File Size : "+fobj.length()+"\n");
                        System.out.println("Readable: "+ fobj.canRead()+"\n");
                        System.out.println("Writable: "+ fobj.canWrite()+"\n");
                        System.out.println("Hidden: "+ fobj.isHidden()+"\n");
                        System.out.println("Last Modified : "+ fobj.lastModified()+"\n");
            }
        } catch (Exception eobj) {
            System.out.println(eobj);
        }

    }

}
