import java.util.*;
import java.io.*;

class FileSystemX {
    public void createNewFile(String fileName) {
        try {
            File file = new File(fileName);
            if (file.createNewFile()) {
                System.out.println("File created successfully.");
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("Error occurred while creating the file.");
            e.printStackTrace();
        }
    }

}

public class createNewFile {
    public static void main(String args [] ) {
       FileSystemX obj = new FileSystemX();
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter the file name to create:");
       String fileName = scanner.nextLine();
       obj.createNewFile(fileName);
        
    }
}
