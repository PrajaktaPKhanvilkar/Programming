//Automorphic Number
// A number whose square ends with the exact same digits as the number it self
// 25 : 25^2 = 625 last digit is 25
import java.io.*;

public class AutomorphicNumber{
    public static void main(String A[]) throws Exception {
        int iNo=0, iTemp =0, iSquare =0,iCount =0, iDen =0 ; 
        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Number :");
        iNo = Integer.parseInt(bobj.readLine());

        iTemp = iNo;

        iSquare = iNo * iNo;

        while (iNo !=0) {
            if(iNo%10 != iSquare%10){
                break;
            }else{
                iNo = iNo/10;
                iSquare = iSquare/10;
            }
        }
        if(iNo == 0){
            System.out.println("Is Automorphic Number");
        }else{
             System.out.println("Is not Automorphic Number");
        }
        
    }
}