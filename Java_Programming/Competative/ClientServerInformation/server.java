package ClientServerInformation;

import java.io.*;
import java.net.*;
import java.time.*;

public class server {
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

    public static void HandleClientRequest(Socket socket) {
        try {
            DataInputStream dis = new DataInputStream(socket.getInputStream());
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

            dos.writeUTF("Connected to marvellous server");
            while (true) {
                String command = dis.readUTF();
                System.out.println("Command received from client" + command);
                String parts[] = command.split(" ");
                String operation = parts[0].toUpperCase();
                if (operation.equals("QUIT")) {
                    dos.writeUTF("Disconnected from server");
                    break;
                }

                if (operation.equals("DATE")) {
                    LocalDate lobj = LocalDate.now();
                    dos.writeUTF("Date is : " + lobj);
                } else if (operation.equals("TIME")) {
                    LocalTime lTimeObj = LocalTime.now();
                    dos.writeUTF("Time is : " + lTimeObj);
                } else if (operation.equals("SERVERNAME")) {
                     String serverName = InetAddress.getLocalHost().getHostName();
                    dos.writeUTF("Server Name is : " + serverName);
                } else if (operation.equals("HELP")) {
                   dos.writeUTF("Available commands: \nDATE \n TIME \n SERVERNAME \n HELP \n QUIT");
                } else {
                    dos.writeUTF("Invalid Operation");
                }

            } // end of while

            socket.close();
            System.out.println("Client disconnected");
        } catch (Exception e) {
            System.out.println("Exception Occured :" + e);
        }
    }
}// end of class
