package ClientServerStringOperations;

import java.io.*;
import java.net.*;

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
                if (parts.length != 2) {
                    dos.writeUTF("Invalid command format");
                    continue;
                }
                String str = parts[1];

                if (operation.equals("LENGTH")) {
                    dos.writeUTF("Length of string is :" + str.length());
                } else if (operation.equals("UPPER")) {
                    dos.writeUTF("String to UpperCase : " + str.toUpperCase());
                } else if (operation.equals("LOWER")) {
                    dos.writeUTF("String to lower : " + str.toLowerCase());
                } else if (operation.equals("REVERSE")) {
                    StringBuffer sb = new StringBuffer(str);
                    dos.writeUTF("Reverse String is : " + sb.reverse());
                } else if (operation.equals("PALINDROME")) {
                    String reversed = new StringBuilder(str).reverse().toString();
                    if (str.equals(reversed)) {
                        dos.writeUTF(str + " is Palindrome");
                    }
                } else if (operation.equals("VOWELS")) {
                    int i = 0, iVowels = 0;
                    str = str.trim();
                    str = str.replaceAll("\\s+", " ");
                    str = str.toLowerCase();
                    char Arr[] = str.toCharArray();

                    for (i = 0; i < Arr.length; i++) {
                        if (Arr[i] == 'a' || Arr[i] == 'e' || Arr[i] == 'i' || Arr[i] == 'o' || Arr[i] == 'u') {
                            iVowels++;
                        }
                    }

                    dos.writeUTF("Vowels are: " + iVowels);

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
