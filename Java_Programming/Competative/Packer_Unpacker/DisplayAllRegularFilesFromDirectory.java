import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class DisplayAllRegularFilesFromDirectory {
    public static void main(String A[]) throws Exception {
        String FolderName = null;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Folder Name:");
        FolderName = sobj.nextLine();
        File fobj = new File(FolderName);

        if ((fobj.exists()) && (fobj.isDirectory())) {
            System.out.println("Folder Exisits");

            File fArr[] = fobj.listFiles();
            System.out.println("Number of files in folder : " + fArr.length);

            for (int i = 0; i < fArr.length; i++) {

                Path path = Paths.get(fArr[i].getName());
                if (Files.isRegularFile(path)) 
                    {
                        System.out.println("File Name is : " + fArr[i].getName());
                    }
                
            }
        } else {
            System.out.println("There is no such folder");
        }

    }
}
