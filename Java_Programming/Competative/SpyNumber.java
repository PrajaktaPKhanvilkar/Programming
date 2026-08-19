//Spy Number
// Sum of digits = Product of digits
// 1124 : 1+1+2+4 = 1*1*2*4 
import java.io.*;

public class SpyNumber{
    public static void main(String A[]) throws Exception {
        int iNo=0, iMult =1, iDigit =0, iSum= 0; 
        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Number :");
        iNo = Integer.parseInt(bobj.readLine());

        while (iNo !=0) {
            iDigit = iNo %10;
            iSum = iSum + iDigit;
            iMult = iMult * iDigit;
            iNo = iNo/10;
        }
        if(iMult == iSum){
            System.out.println("Is Spy Number");
        }else{
             System.out.println("Is not Spy Number");
        }
        
    }
}