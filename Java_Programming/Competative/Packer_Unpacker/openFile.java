import java.util.*;
import java.io.*;

class FileSystemX {
    public void OpenFile(String fileName) {
            try
            {  
                FileInputStream fin=new FileInputStream(fileName);  
                BufferedInputStream bin=new BufferedInputStream(fin);  
                int i=0;  
                while((i=bin.read())!=-1){  
                System.out.println((char)i);  
                }  
                bin.close();  
                fin.close();  
            }
            catch(Exception e){
                System.out.println(e);
            }  
    } 
}

public class openFile {
    public static void main(String args [] ) {
       FileSystemX obj = new FileSystemX();
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter the file name to open:");
       String fileName = scanner.nextLine();
       obj.OpenFile(fileName);
        
    }
}
