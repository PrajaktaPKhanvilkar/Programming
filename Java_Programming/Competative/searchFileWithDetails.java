import java.util.*;
import java.io.*;

public class searchFileWithDetails {
    public static void main(String A[]) {
        File fobj = null;
        File fobj1 = null;
        boolean bRet = false;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Folder Name");
        String fname = sobj.nextLine();
        System.out.println("Enter File name to be searched");
        String file = sobj.nextLine();
        fobj1 = new File(file);
        try {
            fobj = new File(fname);
            bRet = fobj.exists();
            if (bRet == true) {
                File folder = new File(fobj.getPath()); // current directory object
                File files[] = folder.listFiles();

                if (files != null) {
                    for (File f : files) {
                        if (fobj1.getName().equals(f.getName())) {
                            System.out.println("File Name: " + fobj.getName() + "\n");
                            System.out.println("Absolute Path : " + fobj.getPath() + "\n");
                            System.out.println("File Size : " + fobj.length() + "\n");
                            System.out.println("Readable: " + fobj.canRead() + "\n");
                            System.out.println("Writable: " + fobj.canWrite() + "\n");
                            System.out.println("Hidden: " + fobj.isHidden() + "\n");
                            System.out.println("Last Modified : " + fobj.lastModified() + "\n");
                        }
                    }
                }
                if (files.length == 0) {
                    System.out.println("no files available");
                }
            }

        } catch (Exception eobj) {
            System.out.println(eobj);
        }

    }

}
