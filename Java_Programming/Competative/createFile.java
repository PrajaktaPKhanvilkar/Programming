import java.util.*;
import java.io.*;
public class createFile {
    public static void main(String A[]) {
        File fobj  =null;
        boolean bRet = false;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter file name to create");
        String fname = sobj.nextLine();
        try {
            fobj = new File(fname);
            bRet = fobj.exists();
            if(bRet == true){
                System.out.println("File Already Exists");
            }else{
                fobj.createNewFile();
                System.out.println("File gets Successfully created");
            }
        } catch (IOException iobj) {
            System.out.println(iobj);
        } catch (Exception eobj) {
            System.out.println(eobj);
        }

    }

    
}
