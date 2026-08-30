package ClientServerFileDetails;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class client {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        // create client
        try {
            System.out.println("------------------------------------------");
            System.out.println("--------Marvellous client Started---------");
            System.out.println("------------------------------------------");
            Socket socket = new Socket("127.0.0.1", 9000);
            System.out.println("Connection with server successfull");

            DataInputStream dis = new DataInputStream(socket.getInputStream());
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

            System.out.println(dis.readUTF());

            while (true) {
                System.out.println("------------------------------------------");
                System.out.println("FTP commands");
                System.out.println("------------------------------------------");

                System.out.println("INFO <FileName>");
                System.out.println("QUIT");
                System.out.println("------------------------------------------");

                System.out.println("Entr command");
                // Rename Demo.txt Demox.txt
                String command = sobj.nextLine();
                String parts[] = command.split(" ");
                String operation = parts[0].toUpperCase();

                if (operation.equals("INFO")) {
                    if (parts.length != 2) {
                        System.out.println("Usage: INFO <fileName>");
                        continue;
                    }
                    dos.writeUTF(command);
                    String response = dis.readUTF();
                    System.out.println("------------------------------------------");
                    System.out.println("File Information is \n:" + response);
                    System.out.println("------------------------------------------");

                } else if (operation.equals("QUIT")) {
                    if (parts.length != 1) {
                        System.out.println("Usage: QUIT");
                        continue;
                    }
                    System.out.println("Thank you for using marvellous FTP server");
                    dos.writeUTF(command);
                    String response = dis.readUTF();
                    System.out.println(response);
                    break;// it wil treminate the client loop
                } else {
                    System.out.println("There is no shuch Command");
                    continue;
                }
            } // end of while
            socket.close();
            sobj.close();
            dis.close();
            dos.close();
        } // end of try
        catch (Exception e) {
            System.out.println("Exception Occured :" + e);
        }
    }// end of main
}// end of class
