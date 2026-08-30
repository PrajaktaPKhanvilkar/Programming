package ClientServerStringOperations;

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
                System.out.println("String Operations commands");
                System.out.println("------------------------------------------");
                System.out.println("LENGTH <String>");
                System.out.println("UPPER <String>");
                System.out.println("LOWER <String>");
                System.out.println("REVERSE <String>");
                System.out.println("PALINDROME <String>");
                System.out.println("VOWELS <String>");
                System.out.println("QUIT");
                System.out.println("------------------------------------------");

                System.out.println("Entr command");
                String command = sobj.nextLine();

                dos.writeUTF(command);
                String response = dis.readUTF();
                

                if (command.equals("QUIT")) {

                    System.out.println("Thank you for using marvellous String Operations");
                    dos.writeUTF(command);
                    System.out.println(response);
                    break;// it wil treminate the client loop
                }else{
                    System.out.println(response);
                }
            }

        } catch (Exception e) {
            System.out.println("Exception Occured :" + e);
        }
    }
}
