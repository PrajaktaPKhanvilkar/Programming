//TrimorphicNumber Number
// A number whose Square ends with the exact same digits as the number it self
// 25 : 25^3 = 625 last digit is 25
import java.io.*;

public class TrimorphicNumber{
    public static void main(String A[]) throws Exception {
        int iNo=0, iTemp =0, iCube =0,iCount =0, iDen =0 ; 
        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Number :");
        iNo = Integer.parseInt(bobj.readLine());

        iTemp = iNo;

        iCube = iNo * iNo * iNo;

        while (iNo !=0) {
            if(iNo%10 != iCube%10){
                break;
            }else{
                iNo = iNo/10;
                iCube = iCube/10;
            }
        }
        if(iNo == 0){
            System.out.println("Is Automorphic Number");
        }else{
             System.out.println("Is not Automorphic Number");
        }
        
    }
}