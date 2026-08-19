//Palindrom Number


import java.io.*;

public class Palindrome
{
    public static void main(String A[]) throws Exception {
        int iNo=0,iDigit = 0, iTemp =0, iRev =0; 
        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Number :");
        iNo = Integer.parseInt(bobj.readLine());

        iTemp = iNo;

        while (iNo !=0) {
            iDigit = iNo %10;
            iRev = iRev *10 + iDigit;
            iNo = iNo /10;
        }

        if(iTemp == iRev){
            System.out.println("Is Palindrome");
        }else{
             System.out.println("Is not Palindrome");
        }
      
    }
}