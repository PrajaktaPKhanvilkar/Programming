import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class countCheckSum {
    public static void main(String A[]) throws Exception {
        String FileName = null;
        File fobjsrc = null;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Source Name");
        FileName = sobj.nextLine();

        fobjsrc = new File(FileName);

        if(fobjsrc.exists()) {
            Path path = Paths.get(FileName);
            if (Files.isRegularFile(path)) {
                long checksum = 0;
                try (InputStream inputStream = new FileInputStream(fobjsrc)) {
                    int byteRead;
                    while ((byteRead = inputStream.read()) != -1) {
                        checksum += byteRead;
                    }
                } catch (IOException e) {
                    System.out.println("Error occurred while reading the file.");
                    e.printStackTrace();
                }
                System.out.println("Checksum of the file: " + checksum);
            } else {
                System.out.println("The specified file is not a regular file.");
            }
        } else {
            System.out.println("File does not exist.");
        }
        

    }

}
