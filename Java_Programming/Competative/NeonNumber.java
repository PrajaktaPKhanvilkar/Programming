//Neon Number
// Sum of digits of its squares is the number
// 9 : 9^2 = 18 , 8+1 =9 
import java.io.*;

public class NeonNumber{
    public static void main(String A[]) throws Exception {
        int iNo=0, iTemp =0, iSquare =0, iDigit =0, iSum= 0; 
        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Number :");
        iNo = Integer.parseInt(bobj.readLine());

        iTemp = iNo;

        iSquare = iNo * iNo;

        while (iSquare !=0) {
            iDigit = iSquare %10;
            iSum = iSum + iDigit;
            iSquare = iSquare/10;
        }
        if(iTemp == iSum){
            System.out.println("Is Neon Number");
        }else{
             System.out.println("Is not Neon Number");
        }
        
    }
}