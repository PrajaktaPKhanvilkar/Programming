package ClientServerCompare;

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
                double no = Double.parseDouble(parts[1]);

                if (operation.equals("EVEN")) {
                    if (no % 2 == 0) {
                        dos.writeUTF(no + " Is Even Number");
                    }

                } else if (operation.equals("ODD")) {
                    if (no % 2 != 0) {
                        dos.writeUTF(no + " Is ODD Number");
                    }
                } else if (operation.equals("PRIME")) {
                    int iCnt = 0;
                    for (int i = 2; i <= (no / 2); i++) {
                        if ((no % i) == 0) {
                            iCnt++;
                            break;
                        }
                    }
                    if (iCnt == 0) {
                        dos.writeUTF(no + "  is prime");
                    } else {
                        dos.writeUTF(no + " is not prime");
                    }
                } else if (operation.equals("PERFECT")) {
                    int iCnt = 0;
                    int iSum = 0;

                    for (iCnt = 1; iCnt <= (no / 2); iCnt++) {
                        if ((no % iCnt) == 0) {
                            iSum = iSum + iCnt;
                        }
                        if (iSum > no) {
                            break;
                        }
                    }
                    if (iSum == no) {
                        dos.writeUTF(no + "  is perfect number");
                    } else {
                        dos.writeUTF(no + "  is not perfect number");
                    }
                } else if (operation.equals("FACTORIAL")) {
                    int iFact = 1;
                    int iCnt = 0;
                    if (no < 0) {
                        no = -no;
                    }
                    for (iCnt = 1; iCnt <= no; iCnt++) {
                        iFact = iFact * iCnt;
                    }
                    dos.writeUTF("Factorial of " + no + "is :" + iFact);
                } else if (operation.equals("REVERSE")) {
                    double iDigit = 0, iReverse = 0;
                    double iTemp = no;
                    while (no > 0) {
                        iDigit = no % 10;
                        iReverse = (iReverse * 10) + iDigit;
                        no /= 10;
                    }
                    dos.writeUTF("Reverse of "+ no +" is :" + iReverse);
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
