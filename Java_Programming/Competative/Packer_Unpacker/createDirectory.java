import java.io.*;
import java.util.*;

public class createDirectory
 {
    public static void main(String A[]) throws Exception {
            String FolderName = null;
            Scanner sobj = new Scanner(System.in);
            System.out.println("Enter Folder Name:");
            FolderName = sobj.nextLine();
            File fobj = new File(FolderName);

            if((fobj.exists())&& (fobj.isDirectory())){
                System.out.println("Folder Exisits");
            }else{
                System.out.println("There is no such folder");
            }

        }
}
