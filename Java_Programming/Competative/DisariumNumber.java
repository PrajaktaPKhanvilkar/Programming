//Disarium Number
// Sum of digits raised to their Power starting from 1 equals to the number
// 1^1 +3^2 + 5^3 = 1+9+125 = 135
import java.io.*;

public class DisariumNumber{
    public static void main(String A[]) throws Exception {
        int iNo=0, iTemp =0, iSquare =0, iDigit =0, iSum= 0; 
        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Number :");
        iNo = Integer.parseInt(bobj.readLine());
        int power = String.valueOf(iNo).length();
        iTemp = iNo;

            while (iNo > 0) {
            int digit = iNo % 10;
            iSum += Math.pow(digit, power);
            iNo /= 10;
            power--;
        }
        if(iTemp == iSum){
            System.out.println("Is Disarium Number");
        }else{
             System.out.println("Is not Disarium Number");
        }
        
    }
}