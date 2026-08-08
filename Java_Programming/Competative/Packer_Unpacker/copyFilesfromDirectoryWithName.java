import java.io.*;
import java.util.*;

public class copyFilesfromDirectoryWithName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the directory path: ");
        String directoryPath = scanner.nextLine();
        
        System.out.print("Enter the File Name : ");
        String fileName = scanner.nextLine();

        File directory = new File(directoryPath);

        if (!directory.exists() || !directory.isDirectory()) {
            System.out.println("Error: The specified path does not exist or is not a directory.");
            return;
        }

        File[] fileList = directory.listFiles();
        if (fileList == null || fileList.length == 0) {
            System.out.println("The directory is empty or could not be read.");
            return;
        }

        File outputFile = new File(fileName);

        try (FileOutputStream fos = new FileOutputStream(outputFile)) {
            byte[] buffer = new byte[200]; 
            int bytesRead;

            for (File file : fileList) {
                if (file.isFile() && !file.getName().equals(fileName)) {
                    System.out.println("Reading and appending: " + file.getName());
                    fos.write("File Name: \n".getBytes());
                    fos.write(file.getName().getBytes());
                    fos.write("\nData: \n".getBytes());
                    try (FileInputStream fis = new FileInputStream(file)) {
                        while ((bytesRead = fis.read(buffer)) != -1) {
                            fos.write(buffer, 0, bytesRead);
                        }
                    } catch (IOException e) {
                        System.out.println("Could not read file: " + file.getName() + " due to " + e.getMessage());
                    }
                }
            }
            System.out.println("Successfully consolidated all files into " + outputFile.getAbsolutePath());

        } catch (IOException e) {
            System.out.println("An error occurred while managing the output file: " + e.getMessage());
        }
    }
}
