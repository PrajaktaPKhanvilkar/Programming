import java.util.*;
import java.io.*;

public class checkFileType {
    public static void main(String A[]) {
        File fobj = null;
        boolean bRet = false;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Folder Details");
        String fname = sobj.nextLine();
        try {
            fobj = new File(fname);
            bRet = fobj.exists();
            if (bRet == true) {
                File folder = new File(fobj.getPath()); // current directory object
                File files[] = folder.listFiles();
                String result = "";
                if (files != null) {
                    for (File f : files) {
                        if (f.isFile()) {
                            result = result + " [File] " + f.getName() + "\n";
                        }
                        if (f.isDirectory()) {
                            result = result + " [DIR] " + f.getName() + "\n";
                        }
                    }
                }
                if (files.length == 0) {
                    result = "no files available";
                }
                System.out.println(result);
            }
        } catch (Exception eobj) {
            System.out.println(eobj);
        }

    }

}
