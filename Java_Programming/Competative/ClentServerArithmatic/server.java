package ClentServerArithmatic;
import java.io.*;
import java.net.*;

public class server {
    public static void main(String[] args) {
        //create server
        try{
            ServerSocket serverSocket= new ServerSocket(9000);
            System.out.println("------------------------------------------");
            System.out.println("--------Marvellous Server Started---------");
            System.out.println("------------------------------------------");
            
            //loop for multiple client request
            while(true){
                System.out.println("Server is waiting for client request");
                Socket clienSocket = serverSocket.accept();
                System.out.println("Client connected successfully");

                //thread gets created for client
                Thread t= new Thread(()->HandleClientRequest(clienSocket));

                t.start();
            } //end of while

        }catch(Exception e){
            System.out.println("Exception Occured :"+e);
        }
    }//end of main

    public static void HandleClientRequest(Socket socket){
        try{
            DataInputStream dis = new DataInputStream(socket.getInputStream());
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

            dos.writeUTF("Connected to marvellous server");
            while(true){
                String command = dis.readUTF();
                System.out.println("Command received from client"+ command);
                String parts[] = command.split(" ");
                String operation = parts[0].toUpperCase();

                if(operation.equals("QUIT")){
                    dos.writeUTF("Disconnected from server");
                    break;
                }
                if(parts.length != 3){
                    dos.writeUTF("Invalid command format");
                    continue;
                }
                double no1 = Double.parseDouble(parts[1]);
                double no2 = Double.parseDouble(parts[2]);
                double result = 0.0;

                if(operation.equals("ADD")){
                    result = no1+no2;
                    dos.writeUTF("Result is :"+result);
                }else
                if(operation.equals("SUB")){
                    result = no1-no2;
                    dos.writeUTF("Result is :"+result);
                }else
                if(operation.equals("MULT")){
                    result = no1*no2;
                    dos.writeUTF("Result is :"+result);
                }else
                if(operation.equals("DIV")){
                    result = no1/no2;
                    dos.writeUTF("Result is :"+result);
                }else{
                    dos.writeUTF("Invalid Operation");
                }

            } //end of while

            socket.close();
            System.out.println("Client disconnected");
        }catch(Exception e){
            System.out.println("Exception Occured :"+e);
        }
    }
}// end of class
