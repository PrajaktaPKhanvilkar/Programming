package ClientServerCheckExists;

import java.io.*;
import java.net.*;

public class server {
    public static int clientCount = 1;
    public static void main(String[] args) {
        // create server
        try {
            ServerSocket serverSocket = new ServerSocket(9000);
            System.out.println("------------------------------------------");
            System.out.println("--------Marvellous Server Started---------");
            System.out.println("------------------------------------------");

            // loop for multiple client request
            while (true) {
                System.out.println("Server is waiting for client request");
                Socket clienSocket = serverSocket.accept();
                System.out.println("Client connected successfully");

                // thread gets created for client
                Thread t = new Thread(() -> HandleClientRequest(clienSocket));

                t.start();
            } // end of while

        } catch (Exception e) {
            System.out.println("Exception Occured :" + e);
        }
    }// end of main

    // request handler for each client request
    public static void HandleClientRequest(Socket socket) {
        System.out.println("new thread gets created for client no: "+ clientCount);
        clientCount++;
        try {
            DataInputStream dis = new DataInputStream(socket.getInputStream());
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

            dos.writeUTF("Connected to marvellous server");
            while (true) {
                //read command from client
                String command = dis.readUTF();
                System.out.println("Command received from client" + command);
                String parts[] = command.split(" ");
                String operation = parts[0].toUpperCase();

                if (operation.equals("QUIT")) {
                    if (parts.length != 1) {
                        dos.writeUTF("usage: QUIT");
                        continue;
                    }
                    dos.writeUTF("Disconnected from server");
                    clientCount--;
                    break;
                }
                if (operation.equals("EXISTS")) {
                    if (parts.length != 2) {
                        dos.writeUTF("usage: EXISTS <fileName>");
                        continue;
                    }
                    File file = new File(parts[1]);
                    if(file.exists()){
                        dos.writeUTF("File Exists");
                    }else{
                        dos.writeUTF("File Does Not exists");
                    }

                }else {
                    dos.writeUTF("Invalid Operation");
                }
                
            } // end of while

            socket.close();
            dis.close();
            dos.close();
            System.out.println("Client disconnected");
        } // end of try
        catch (Exception e) {
            System.out.println("Exception Occured :" + e);
        }
    }// end of handleclient request method
}// end of class
