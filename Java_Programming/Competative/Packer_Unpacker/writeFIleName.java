import java.io.*;  
import java.util.*;

class FileSystemX {
    public void writeFile(String fileName, String content) {
        try {
            FileOutputStream fout = new FileOutputStream(fileName);
            byte b[] = content.getBytes(); // converting string into byte array
            fout.write(b);
            fout.close();
            System.out.println("File written successfully...");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
public class writeFileName {
    public static void main(String args [] ) {
       FileSystemX obj = new FileSystemX();
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter the file name to open:");
       String fileName = scanner.nextLine();
       obj.writeFile(fileName, "Hello, World!");
    }
}