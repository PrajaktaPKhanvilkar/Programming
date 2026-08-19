//Summny Number
//  Num + 1 = perfect Square
// 8+1 =9 ; 9 is perfect square
import java.io.*;

public class SunnyNumber{
    public static void main(String A[]) throws Exception {
        int iNo=0, iMult =1, iDigit =0, iSum= 0; 
        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Number :");
        iNo = Integer.parseInt(bobj.readLine());

        iSum = iNo +1;

        int sqrt = (int) Math.sqrt(iSum);
        if(sqrt * sqrt == iSum){
            System.out.println("Is Sunny Number");
        }else{
             System.out.println("Is not Sunny Number");
        }
        
    }
}