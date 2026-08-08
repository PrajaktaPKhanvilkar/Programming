import java.io.*;
import java.util.*;

public class copyFile {
    public static void main(String A[]) throws Exception {
        String FnameSrc = null;
        String FnameDest = null;

        File fobjsrc = null;
        File fobjDest = null;

        FileInputStream fiobj = null;
        FileOutputStream foobj = null;

        int iRet = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Source Name");
        FnameSrc = sobj.nextLine();

        System.out.println("Enter Destination File Name");
        FnameDest = sobj.nextLine();

        fobjsrc = new File(FnameSrc);
        fobjDest = new File(FnameDest);

        fiobj = new FileInputStream(fobjsrc);
        foobj = new FileOutputStream(fobjDest);

        fobjDest.createNewFile();

        byte Buffer[] = new byte[100];

        if (fobjsrc.exists()) {
            while ((iRet = fiobj.read(Buffer)) != -1) {
                foobj.write(Buffer, 0, iRet);
            }
            fiobj.close();
            foobj.close();
        } else {
            System.out.println("There is no such file");
        }

    }

}
