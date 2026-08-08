import java.io.*;
import java.util.*;

public class copyFilesFromDirectory {
    public static void main(String A[]) throws Exception {
        String FolderName = null;
        String FnameDest = null;

        File fobjDest = null;

        FileOutputStream foobj = null;

        int iRet = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Folder Name:");
        FolderName = sobj.nextLine();
        File fobj = new File(FolderName);

        System.out.println("Enter Destination File Name");
        FnameDest = sobj.nextLine();

        fobjDest = new File(FnameDest);

        foobj = new FileOutputStream(fobjDest);

        fobjDest.createNewFile();

        byte Buffer[] = new byte[100];

        if((fobj.exists())&& (fobj.isDirectory())){
                System.out.println("Folder Exisits");

                File fArr[] = fobj.listFiles();
                for(int i =0; i<fArr.length;i++){
                    foobj.write("File Name: \n".getBytes());
                    foobj.write(fArr[i].getName().getBytes());
                }
                foobj.close();
            }else{
                System.out.println("There is no such folder");
            }
    }

}
