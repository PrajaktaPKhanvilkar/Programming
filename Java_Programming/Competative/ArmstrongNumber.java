//Armstrong number
//153 = 1^3 + 5^3 + 3^3  =153
//sum of digits raised to total number or digits in number


import java.io.*;

public class ArmstrongNumber {
    public static void main(String A[]) throws Exception {
        int iNo=0, iCount =0,iDigit = 0, iTemp =0, iSum =0; 
        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Number :");
        iNo = Integer.parseInt(bobj.readLine());

        iTemp =iNo;
        while (iNo !=0) {
            iCount++;
            iNo = iNo /10;
        }

        iNo = iTemp;
        while (iNo !=0) {
            iDigit = iNo %10;
            iSum = iSum + (int) Math.pow(iDigit, iCount);
            iNo = iNo /10;
        }

        if(iSum == iTemp){
             System.out.println("Is Armstrong Number");
        }else{
            System.out.println("Is Not Armstrong Number");
        }
       
    }
}