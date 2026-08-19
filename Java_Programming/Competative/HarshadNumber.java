//Harshad number/ Niven Number
//integer that can be divided evenly by the sum of its digits
//12 =  (1+2) = 3 122/3 = 4 (evenly divisible)  i.e remainder is 0 then its a Harshad Number
import java.io.*;

public class HarshadNumber{
    public static void main(String A[]) throws Exception {
        int iNo=0,iDigit = 0, iTemp =0, iSum =0; 
        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Number :");
        iNo = Integer.parseInt(bobj.readLine());

        iTemp = iNo;

        while (iNo !=0) {
            iDigit = iNo %10;
            iSum = iSum + iDigit;
            iNo = iNo /10;
        }

        if(iTemp % iSum == 0){
            System.out.println("Is Harshad Number");
        }else{
             System.out.println("Is not Harshad Number");
        }
      
    }
}